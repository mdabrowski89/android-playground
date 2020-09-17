package pl.mobite.playground.common.preferences

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

/**
 * Provides current implementation of [SharedPreferences]
 * */
abstract class SharedPreferencesProvider(name: String, context: Context) {
    val preferences: SharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)

    fun clear() {
        preferences.edit { clear() }
    }
}

/**
 * Creates property to [SharedPreferences] element delegation
 *
 * @throws IllegalArgumentException if expected [T] is not optional but null value has been received
 * */
inline fun <reified T> SharedPreferencesProvider.preference(
    name: String? = null
): PreferenceProvider<T> {
    return when {
        null is T -> createPreferenceProvider(name) { null as T }
        else -> throw IllegalArgumentException("nonNull values has to provide default factory")
    }
}

/**
 * Creates property to [SharedPreferences] element delegation.
 *
 * If value does not exists [default] factory is used to create values
 * */
inline fun <reified T> SharedPreferencesProvider.preference(
    name: String? = null,
    crossinline default: () -> T
): PreferenceProvider<T> =
    createPreferenceProvider(name) { default() }

/**
 * Creates property to [SharedPreferences] element delegation.
 *
 * If value does not exists [default] value is use instead
 * */
inline fun <reified T> SharedPreferencesProvider.preference(
    name: String? = null,
    default: T
): PreferenceProvider<T> =
    createPreferenceProvider(name) { default }
