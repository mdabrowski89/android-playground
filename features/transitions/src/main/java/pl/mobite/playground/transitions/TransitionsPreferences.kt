package pl.mobite.playground.transitions

import android.content.Context
import pl.mobite.playground.common.preferences.SharedPreferencesProvider
import pl.mobite.playground.common.preferences.preference

class TransitionsPreferences(
    context: Context
) : SharedPreferencesProvider(
    name = "TransitionsPreferences",
    context = context
) {

    var lastUsedCase: String? by preference()
}