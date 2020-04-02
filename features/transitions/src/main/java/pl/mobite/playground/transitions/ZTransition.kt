package pl.mobite.playground.transitions

import android.animation.Animator
import android.animation.ObjectAnimator
import android.transition.Slide
import android.transition.Transition
import android.transition.TransitionValues
import android.transition.Visibility
import android.view.Gravity
import android.view.View
import android.view.ViewGroup

class ZTransition : Visibility() {

    override fun onAppear(
        sceneRoot: ViewGroup?,
        view: View?,
        startValues: TransitionValues?,
        endValues: TransitionValues?
    ): Animator? {
        view?.translationZ = 100f
        return ObjectAnimator.ofFloat(view, "translationZ", 100f);
        //return null;
    }

    override fun onDisappear(
        sceneRoot: ViewGroup?,
        view: View?,
        startValues: TransitionValues?,
        endValues: TransitionValues?
    ): Animator? {
        //view?.transitionAlpha = 1f
        //return ObjectAnimator.ofFloat(view, "transi", 1f);
        return null
    }
}