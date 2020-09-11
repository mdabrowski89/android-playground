package pl.mobite.playground.transitions.case2

import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.case2_fragment_parent.*
import pl.mobite.playground.transitions. R.layout
import pl.mobite.playground.transitions.utils.HoldTransition

class ParentFragment : Fragment(layout.case2_fragment_parent) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        transitionFromRightButton.setOnClickListener {
            // TODO, fix bug on Api 21: https://stackoverflow.com/questions/30083820/android-bug-in-slide-activity-transition
            exitTransition = Slide(Gravity.START)
            val action =
                ParentFragmentDirections.actionParentToDetails(
                    isSlideFromRight = true
                )
            val extras = FragmentNavigatorExtras(transitionFromRightButton to "sharedView")
            findNavController().navigate(action, extras)
        }

        transitionFromBottomButton.setOnClickListener {
            exitTransition = HoldTransition()
            val action =
                ParentFragmentDirections.actionParentToDetails(
                    isSlideFromBottom = true
                )
            val extras = FragmentNavigatorExtras(transitionFromBottomButton to "sharedView")
            findNavController().navigate(action, extras)
        }

        animationFromRightButton.setOnClickListener {
            exitTransition = null
            val action =
                ParentFragmentDirections.actionParentToDetailsAnimRight()
            val extras = FragmentNavigatorExtras(animationFromRightButton to "sharedView")
            findNavController().navigate(action, extras)
        }

        animationFromBottomButton.setOnClickListener {
            exitTransition = null
            val action =
                ParentFragmentDirections.actionParentToDetailsAnimBottom()
            val extras = FragmentNavigatorExtras(animationFromBottomButton to "sharedView")
            findNavController().navigate(action, extras)
        }
    }
}