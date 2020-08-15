package pl.mobite.playground.transitions.case1

import android.os.Bundle
import android.transition.Slide
import android.transition.TransitionInflater
import android.view.Gravity
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.case1_fragment_details.*
import pl.mobite.playground.transitions.R

class DetailsFragment : Fragment(R.layout.case1_fragment_details) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enterTransition = Slide(Gravity.END)
        sharedElementEnterTransition =
            TransitionInflater
                .from(context)
                .inflateTransition(android.R.transition.move)
                .setDuration(600)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonB.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}