package pl.mobite.playground.common.preferences

import java.lang.IllegalArgumentException
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

interface PreferenceProvider<T> {
    operator fun provideDelegate(
        ref: SharedPreferencesProvider,
        prop: KProperty<*>
    ): ReadWriteProperty<SharedPreferencesProvider, T>
}

@PublishedApi
internal inline fun <reified T> createPreferenceProvider(
    name: String? = null,
    crossinline default: (key: String) -> T
): PreferenceProvider<T> {

    return object : PreferenceProvider<T> {
        override fun provideDelegate(
            ref: SharedPreferencesProvider,
            prop: KProperty<*>
        ): ReadWriteProperty<SharedPreferencesProvider, T> {
            val argName = name ?: prop.name

            return when (T::class) {
                String::class -> createStringPreferenceDelegation(argName, default)
                Boolean::class -> createBooleanPreferenceDelegation(argName, default)
                Int::class -> createIntPreferenceDelegation(argName, default)
                Long::class -> createLongPreferenceDelegation(argName, default)
                else -> throw IllegalArgumentException("Unsupported type of shared preferences")
            }
        }
    }
}
