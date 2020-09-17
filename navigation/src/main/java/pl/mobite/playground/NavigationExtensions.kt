package pl.mobite.playground

import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.findNavController

fun NavDirections.navigate(fragment: Fragment, extras: FragmentNavigator.Extras? = null) {
    runCatching {
        extras
            ?.let { fragment.findNavController().navigate(this, it) }
            ?: fragment.findNavController().navigate(this)
    }.onFailure {
        it.printStackTrace()
    }
}