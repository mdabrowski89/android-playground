package pl.mobite.playground.transitions

import android.os.Bundle
import android.transition.Fade
import android.transition.Slide
import android.view.Gravity
import android.view.View
import androidx.navigation.fragment.FragmentNavigatorExtras
import kotlinx.android.synthetic.main.fragment_center.*
import pl.mobite.playground.common.BaseFragment

class CenterFragment : BaseFragment(R.layout.fragment_center) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        moveRight.setOnClickListener {
            exitTransition = Slide(Gravity.START)
            val extras = FragmentNavigatorExtras(sharedView to "sharedElement")
            CenterFragmentDirections
                .actionCenterToRight()
                .navigate(extras)
        }
        moveDown.setOnClickListener {
            exitTransition = Fade(Fade.MODE_OUT)
            val extras = FragmentNavigatorExtras(sharedView to "sharedElement")
            CenterFragmentDirections
                .actionCenterToBottom()
                .navigate(extras)
        }
    }
}