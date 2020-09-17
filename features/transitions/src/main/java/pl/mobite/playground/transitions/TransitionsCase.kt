package pl.mobite.playground.transitions

import androidx.annotation.StringRes

enum class TransitionsCase(@StringRes val descriptionResId: Int) {
    CASE_1(R.string.transitions_case1_description),
    CASE_2(R.string.transitions_case2_description),
    CASE_3(R.string.transitions_case3_description),
    CASE_4(R.string.transitions_case4_description),
    CASE_5(R.string.transitions_case5_description)
}
