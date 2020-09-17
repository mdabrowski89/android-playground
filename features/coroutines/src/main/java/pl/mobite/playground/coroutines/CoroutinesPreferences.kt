package pl.mobite.playground.coroutines

import android.content.Context
import pl.mobite.playground.common.preferences.SharedPreferencesProvider
import pl.mobite.playground.common.preferences.preference

class CoroutinesPreferences(
    context: Context
) : SharedPreferencesProvider(
    name = "CoroutinesPreferences",
    context = context
) {

    var lastUsedCase: String? by preference()
}