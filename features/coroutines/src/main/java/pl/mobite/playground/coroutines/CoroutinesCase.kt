package pl.mobite.playground.coroutines

import androidx.annotation.StringRes

enum class CoroutinesCase(@StringRes val descriptionResId: Int) {
    CASE_1(R.string.coroutines_case1_description)
}
