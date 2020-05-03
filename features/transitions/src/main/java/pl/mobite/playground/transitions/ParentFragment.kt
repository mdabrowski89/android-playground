package pl.mobite.playground.transitions

import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import android.view.View
import androidx.navigation.fragment.FragmentNavigatorExtras
import kotlinx.android.synthetic.main.fragment_parent.*
import pl.mobite.playground.common.BaseFragment
import pl.mobite.playground.transitions.utils.HoldTransition

class ParentFragment : BaseFragment(R.layout.fragment_parent) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /** Slide details from the right */
        showDetailsButton1.setOnClickListener {
            // TODO, fix bug on Api 21: https://stackoverflow.com/questions/30083820/android-bug-in-slide-activity-transition
            exitTransition = Slide(Gravity.START)
            val action = ParentFragmentDirections.actionParentToDetails(isSlideFromRight = true)
            val extras = FragmentNavigatorExtras(showDetailsButton1 to "sharedButton")
            navController.navigate(action, extras)
        }

        /** Slide details from the bottom */
        showDetailsButton2.setOnClickListener {
            exitTransition = HoldTransition()
            val action = ParentFragmentDirections.actionParentToDetails(isSlideFromBottom = true)
            val extras = FragmentNavigatorExtras(showDetailsButton2 to "sharedButton")
            navController.navigate(action, extras)
        }
    }
}