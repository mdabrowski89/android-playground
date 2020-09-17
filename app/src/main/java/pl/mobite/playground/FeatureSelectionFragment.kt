package pl.mobite.playground

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_feature_selection.*
import pl.mobite.playground.Feature.COROUTINES
import pl.mobite.playground.Feature.TRANSITION
import java.util.concurrent.atomic.AtomicBoolean

class FeatureSelectionFragment : Fragment(R.layout.fragment_feature_selection) {

    private val preferences by lazy { FeatureSelectionPreferences(requireContext()) }
    private var initialRun = AtomicBoolean(true)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        transitionFeatureButton.setOnClickListener { navigateToFeature(TRANSITION) }

        coroutinesFeatureButton.setOnClickListener { navigateToFeature(COROUTINES) }

        if (initialRun.getAndSet(false)) {
            kotlin.runCatching {
                preferences.lastUsedFeature?.let {
                    navigateToFeature(Feature.valueOf(it))
                }
            }
        }
    }

    private fun navigateToFeature(feature: Feature?) {
        if (feature == null) return
        preferences.lastUsedFeature = feature.name
        when (feature) {
            TRANSITION -> FeatureSelectionFragmentDirections.actionFeatureSelectionToTransitions()
            COROUTINES -> FeatureSelectionFragmentDirections.actionFeatureSelectionToCoroutines()
        }.navigate(this)
    }
}