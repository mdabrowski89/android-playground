package pl.mobite.playground.transitions

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_first.*
import pl.mobite.playground.common.BaseFragment

class FirstFragment : BaseFragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        moveForwardButton.setOnClickListener {
            FirstFragmentDirections
                .actionFirstToSecond()
                .navigate()
        }
    }
}