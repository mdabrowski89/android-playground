package pl.mobite.playground.transitions

import android.os.Bundle
import android.transition.Slide
import android.transition.TransitionInflater
import android.view.Gravity
import android.view.View
import kotlinx.android.synthetic.main.fragment_right.*
import pl.mobite.playground.common.BaseFragment

class RightFragment : BaseFragment(R.layout.fragment_right) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enterTransition = Slide(Gravity.END)
        sharedElementEnterTransition =
            TransitionInflater.from(context).inflateTransition(android.R.transition.move)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        moveBackButton.setOnClickListener {
            navController.popBackStack()
        }
    }
}