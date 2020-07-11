package pl.mobite.playground.transitions.simple

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_a.*
import pl.mobite.playground.transitions.R

class FragmentA : Fragment(R.layout.fragment_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonA.setOnClickListener {
            val action = FragmentADirections.actionAToB()
            val extras = FragmentNavigatorExtras(buttonA to "buttonB")
            findNavController().navigate(action, extras)
        }
    }
}