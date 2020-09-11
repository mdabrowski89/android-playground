package pl.mobite.playground.transitions.case2

import android.os.Bundle
import android.transition.Slide
import android.transition.TransitionInflater
import android.view.Gravity
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.case2_fragment_details.*
import pl.mobite.playground.transitions.R.layout

class DetailsFragment : Fragment(layout.case2_fragment_details) {

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
            findNavController().popBackStack()
        }
    }
}