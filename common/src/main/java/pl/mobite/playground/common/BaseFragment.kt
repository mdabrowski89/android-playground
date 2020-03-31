package pl.mobite.playground.common

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.findNavController

abstract class BaseFragment(@LayoutRes layoutId: Int) : Fragment(layoutId) {

    protected val navController by lazy { findNavController() }

    protected fun NavDirections.navigate(extras: FragmentNavigator.Extras? = null) {
        extras
            ?.let { navController.navigate(this, it) }
            ?: navController.navigate(this)
    }
}