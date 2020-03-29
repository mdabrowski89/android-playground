package pl.mobite.playground.transitions

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_second.*
import pl.mobite.playground.common.BaseFragment

class SecondFragment : BaseFragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        moveBackButton.setOnClickListener {
            navController.popBackStack()
        }
    }
}