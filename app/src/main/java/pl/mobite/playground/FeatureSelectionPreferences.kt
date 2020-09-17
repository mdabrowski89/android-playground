package pl.mobite.playground

import android.content.Context
import pl.mobite.playground.common.preferences.SharedPreferencesProvider
import pl.mobite.playground.common.preferences.preference

class FeatureSelectionPreferences(
    context: Context
) : SharedPreferencesProvider(
    name = "FeatureSelectionPreferences",
    context = context
) {

    var lastUsedFeature: String? by preference()
}