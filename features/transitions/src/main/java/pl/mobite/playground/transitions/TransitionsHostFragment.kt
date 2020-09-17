package pl.mobite.playground.transitions

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_transitions_host.*
import pl.mobite.playground.common.utils.toast
import pl.mobite.playground.transitions.TransitionsCase.CASE_1
import pl.mobite.playground.transitions.TransitionsCase.CASE_2

class TransitionsHostFragment : Fragment(R.layout.fragment_transitions_host) {

    private val childNavController by lazy {
        childFragmentManager
            .fragments.find { it is NavHostFragment }
            ?.findNavController()!!
    }

    private val preferences by lazy { TransitionsPreferences(requireContext()) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbarView.init(
            onMenuClick = { navigateBackToMenu() },
            onChangeCaseButtonClick = { openCaseSelectionDialog() }
        )

        kotlin.runCatching {
            preferences.lastUsedCase?.let {
                navigateToCase(TransitionsCase.valueOf(it))
            }
        }
    }

    private fun navigateBackToMenu() =
        findNavController().popBackStack(R.id.featureSelection, false)

    private fun openCaseSelectionDialog() {
        val cases = TransitionsCase.values().map { getString(it.descriptionResId) }.toTypedArray()
        AlertDialog
            .Builder(context)
            .setItems(cases) { _, index -> navigateToCase(TransitionsCase.values()[index]) }
            .show()
    }

    private fun navigateToCase(case: TransitionsCase) {
        preferences.lastUsedCase = case.name
        when (case) {
            CASE_1 -> childNavController.setGraph(R.navigation.transitions_case1_nav_graph)
            CASE_2 -> childNavController.setGraph(R.navigation.transitions_case2_nav_graph)
            // TODO: implement other graphs
            else -> {
                toast("Not yet implemented")
                return
            }
        }

        toolbarView.setText(getString(case.descriptionResId))
    }
}