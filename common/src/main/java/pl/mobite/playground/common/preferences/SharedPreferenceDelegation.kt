package pl.mobite.playground.common.preferences

import androidx.core.content.edit
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

inline fun <reified T> createStringPreferenceDelegation(
    key: String,
    crossinline default: (key: String) -> T
): ReadWriteProperty<SharedPreferencesProvider, T> {

    return object :
        ReadWriteProperty<SharedPreferencesProvider, T> {
        override fun getValue(thisRef: SharedPreferencesProvider, property: KProperty<*>): T {
            return thisRef.preferences.getString(key, null) as? T ?: default(key).also {
                setValue(thisRef, property, it)
            }
        }

        override fun setValue(
            thisRef: SharedPreferencesProvider,
            property: KProperty<*>,
            value: T
        ) {
            thisRef.preferences.edit {
                putString(key, value as? String)
            }
        }
    }
}

inline fun <reified T> createBooleanPreferenceDelegation(
    key: String,
    crossinline default: (key: String) -> T
): ReadWriteProperty<SharedPreferencesProvider, T> {

    return object :
        ReadWriteProperty<SharedPreferencesProvider, T> {
        override fun getValue(thisRef: SharedPreferencesProvider, property: KProperty<*>): T {
            return thisRef.preferences.getBoolean(key, default(key) as Boolean) as T
        }

        override fun setValue(
            thisRef: SharedPreferencesProvider,
            property: KProperty<*>,
            value: T
        ) {
            thisRef.preferences.edit {
                putBoolean(key, value as Boolean)
            }
        }
    }
}

inline fun <reified T> createIntPreferenceDelegation(
    key: String,
    crossinline default: (key: String) -> T
): ReadWriteProperty<SharedPreferencesProvider, T> {

    return object :
        ReadWriteProperty<SharedPreferencesProvider, T> {
        override fun getValue(thisRef: SharedPreferencesProvider, property: KProperty<*>): T {
            return thisRef.preferences.getInt(key, default(key) as Int) as T
        }

        override fun setValue(
            thisRef: SharedPreferencesProvider,
            property: KProperty<*>,
            value: T
        ) {
            thisRef.preferences.edit {
                putInt(key, value as Int)
            }
        }
    }
}

inline fun <reified T> createLongPreferenceDelegation(
    key: String,
    crossinline default: (key: String) -> T
): ReadWriteProperty<SharedPreferencesProvider, T> {

    return object :
        ReadWriteProperty<SharedPreferencesProvider, T> {
        override fun getValue(thisRef: SharedPreferencesProvider, property: KProperty<*>): T {
            return thisRef.preferences.getLong(key, default(key) as Long) as T
        }

        override fun setValue(
            thisRef: SharedPreferencesProvider,
            property: KProperty<*>,
            value: T
        ) {
            thisRef.preferences.edit {
                putLong(key, value as Long)
            }
        }
    }
}
