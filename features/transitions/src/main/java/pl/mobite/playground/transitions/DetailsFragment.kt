package pl.mobite.playground.transitions

import android.os.Bundle
import android.transition.Slide
import android.transition.TransitionInflater
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.LinearInterpolator
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_details.*
import pl.mobite.playground.common.BaseFragment

class DetailsFragment : BaseFragment(R.layout.fragment_details) {

    private val args: DetailsFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enterTransition = when {
            args.isSlideFromBottom -> Slide(Gravity.BOTTOM)
            args.isSlideFromRight -> Slide(Gravity.END)
            else -> null
        }
        sharedElementEnterTransition = TransitionInflater.from(context).inflateTransition(android.R.transition.move)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backButton.setOnClickListener {
            navController.popBackStack()
        }
    }
}