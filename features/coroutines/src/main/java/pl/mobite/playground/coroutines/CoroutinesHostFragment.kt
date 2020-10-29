package pl.mobite.playground.coroutines

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_coroutines_host.*
import pl.mobite.playground.common.utils.toast
import pl.mobite.playground.coroutines.CoroutinesCase.CASE_1

class CoroutinesHostFragment : Fragment(R.layout.fragment_coroutines_host) {

    private val childNavController by lazy {
        childFragmentManager
            .fragments.find { it is NavHostFragment }
            ?.findNavController()!!
    }

    private val preferences by lazy { CoroutinesPreferences(requireContext()) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbarView.init(
            onMenuClick = { navigateBackToMenu() },
            onChangeCaseButtonClick = { openCaseSelectionDialog() }
        )

        kotlin.runCatching {
            preferences.lastUsedCase?.let {
                navigateToCase(CoroutinesCase.valueOf(it))
            }
        }
    }

    private fun navigateBackToMenu() =
        findNavController().popBackStack(R.id.featureSelection, false)

    private fun openCaseSelectionDialog() {
        val cases = CoroutinesCase.values().map { getString(it.descriptionResId) }.toTypedArray()
        AlertDialog
            .Builder(context)
            .setItems(cases) { _, index -> navigateToCase(CoroutinesCase.values()[index]) }
            .show()
    }

    private fun navigateToCase(case: CoroutinesCase) {
        preferences.lastUsedCase = case.name
        when (case) {
            CASE_1 -> childNavController.setGraph(R.navigation.coroutines_case1_nav_graph)
        }

        toolbarView.setText(getString(case.descriptionResId))
    }
}