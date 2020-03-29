object VersionsCore {

    const val gradle = "3.6.1"

    const val kotlin = "1.3.71"
    const val kotlinCoroutines = "1.3.5"

    const val rxAndroid = "2.1.1"
    const val rxKotlin = "2.4.0"
    const val rxBinding = "3.0.0"
    const val rxRelay = "2.1.1"

    const val retrofit = "2.8.1"
    const val retrofitOkHttp = "3.12.0"
    const val retrofitSynchronousAdapter = "0.5.0"

    const val gson = "2.8.2"

    const val koin = "2.1.5"
    const val dagger = "2.27"
}

object DependenciesCore {

    const val gradlePlugin = "com.android.tools.build:gradle:${VersionsCore.gradle}"

    const val kotlinStd = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${VersionsCore.kotlin}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${VersionsCore.kotlin}"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${VersionsCore.kotlin}"

    const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${VersionsCore.kotlinCoroutines}"
    const val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${VersionsCore.kotlinCoroutines}"

    const val koin = "org.koin:koin-android:${VersionsCore.koin}"
    const val koinScope = "org.koin:koin-androidx-scope:${VersionsCore.koin}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${VersionsCore.koin}"
    const val koinFragment = "org.koin:koin-androidx-fragment:${VersionsCore.koin}"
    const val koinExperimental = "org.koin:koin-androidx-ext:${VersionsCore.koin}"
    const val koinTest = "org.koin:koin-test:${VersionsCore.koin}"

    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${VersionsCore.rxAndroid}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${VersionsCore.rxKotlin}"
    const val rxBinding = "com.jakewharton.rxbinding3:rxbinding:${VersionsCore.rxBinding}"
    const val rxRelay = "com.jakewharton.rxrelay2:rxrelay:${VersionsCore.rxRelay}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${VersionsCore.retrofit}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${VersionsCore.retrofit}"
    const val retrofitRxJava2Adapter = "com.squareup.retrofit2:adapter-rxjava2:${VersionsCore.retrofit}"
    const val retrofitOkHttp = "com.squareup.okhttp3:okhttp:${VersionsCore.retrofitOkHttp}"
    const val retrofitOkHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${VersionsCore.retrofitOkHttp}"
    const val retrofitSynchronousAdapter = "com.jaredsburrows.retrofit:retrofit2-synchronous-adapter:${VersionsCore.retrofitSynchronousAdapter}"

    const val gson = "com.google.code.gson:gson:${VersionsCore.gson}"

    const val dagger = "com.google.dagger:dagger:${VersionsCore.dagger}"
    const val daggerAndroid = "com.google.dagger:dagger-android-support:${VersionsCore.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${VersionsCore.dagger}"
    const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${VersionsCore.dagger}"
}