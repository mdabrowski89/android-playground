package pl.mobite.playground.transitions

import android.animation.Animator
import android.animation.ObjectAnimator
import android.transition.TransitionValues
import android.transition.Visibility
import android.view.View
import android.view.ViewGroup
import androidx.core.transition.addListener

class Hold : Visibility() {

    override fun captureStartValues(transitionValues: TransitionValues?) {
        super.captureStartValues(transitionValues)
        captureValues(transitionValues)
    }

    override fun captureEndValues(transitionValues: TransitionValues?) {
        super.captureEndValues(transitionValues)
        captureValues(transitionValues)
    }

    private fun captureValues(transitionValues: TransitionValues?) {
        transitionValues?.apply {
            val loc = IntArray(2)
            transitionValues.view.getLocationOnScreen(loc)
            transitionValues.values[PROPNAME_SCREEN_LOCATION] = loc
        }
    }

    /**
     * Overriding of this method is required because the original one was placed the disappearing
     * fragment view in an overlay view of the appearing fragment which hides the enter animation
     */
    override fun onDisappear(
        sceneRoot: ViewGroup?,
        startValues: TransitionValues?,
        startVisibility: Int,
        endValues: TransitionValues?,
        endVisibility: Int
    ): Animator? {
        val startView = startValues?.view
        if (sceneRoot != null && startView != null && startView.parent == null) {
            val screenLoc = startValues.values[PROPNAME_SCREEN_LOCATION] as IntArray
            val loc = IntArray(2)
            sceneRoot.getLocationOnScreen(loc)
            startView.offsetLeftAndRight(screenLoc[0] - loc[0] - startView.left)
            startView.offsetTopAndBottom(screenLoc[1] - loc[1] - startView.top)
            sceneRoot.addView(startView, 0)

            val animator = onDisappear(sceneRoot, startView, startValues, endValues)
            if (animator == null) {
                sceneRoot.removeView(startView)
            } else {
                var listener: TransitionListener? = null
                listener = addListener(
                    onPause = { sceneRoot.removeView(startView) },
                    onResume = {
                        if (startView.parent == null) {
                            sceneRoot.addView(startView, 0)
                        }
                    },
                    onEnd = { transition ->
                        sceneRoot.removeView(startView)
                        transition.removeListener(listener)
                    }
                )
            }
            return animator
        }
        return super.onDisappear(sceneRoot, startValues, startVisibility, endValues, endVisibility)
    }

    override fun onDisappear(
        sceneRoot: ViewGroup?,
        view: View?,
        startValues: TransitionValues?,
        endValues: TransitionValues?
    ): Animator? {
        return view?.let {
            ObjectAnimator.ofFloat(it, "transitionAlpha", it.transitionAlpha)
        }
    }

    companion object {
        private const val PROPNAME_SCREEN_LOCATION =
            "${BuildConfig.LIBRARY_PACKAGE_NAME}:visibility:screenLocation"
    }
}