package pl.mobite.playground.transitions

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

class TransitionsHostFragment : Fragment(R.layout.fragment_transitions_host) {

    private val navController by lazy {
        childFragmentManager
            .fragments.find { it is NavHostFragment }
            ?.findNavController()!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}