package pl.mobite.playground.transitions.case1

import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.case1_fragment_parent.*
import pl.mobite.playground.transitions.R

class ParentFragment : Fragment(R.layout.case1_fragment_parent) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonA.setOnClickListener {
            exitTransition = Slide(Gravity.START)
            val action = ParentFragmentDirections.actionParentToDetails()
            val extras = FragmentNavigatorExtras(buttonA to "buttonB")
            findNavController().navigate(action, extras)
        }
    }
}