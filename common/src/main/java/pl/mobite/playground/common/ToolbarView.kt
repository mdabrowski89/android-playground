package pl.mobite.playground.common

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.view_toolbar.view.*

class ToolbarView constructor(
    context: Context,
    attrs: AttributeSet?
) : LinearLayout(context, attrs) {

    init {
        View.inflate(context, R.layout.view_toolbar, this)
        orientation = HORIZONTAL
        background = ColorDrawable(ContextCompat.getColor(context, R.color.colorPrimaryDark))
    }

    fun init(
        onMenuClick: (() -> Unit)? = null,
        onChangeCaseButtonClick: (() -> Unit)? = null
    ) {
        menuButton.isVisible = onMenuClick != null
        menuButton.setOnClickListener { onMenuClick?.invoke() }

        changeCaseButton.isVisible = onChangeCaseButtonClick != null
        changeCaseButton.setOnClickListener { onChangeCaseButtonClick?.invoke() }
    }

    fun setText(text: String) {
        currentCaseText.text = text
    }
}