object VersionsAndroidX {

    // Ktx:
    const val coreKtx = "1.2.0"
    const val fragmentKtx = "1.2.3"
    const val activityKtx = "1.1.0"
    const val collectionKtx = "1.1.0"
    const val paletteKtx = "1.0.0"

    // UI:
    const val cardview = "1.0.0"
    const val vectorDrawable = "1.1.0"
    const val constraintLayout = "2.0.0-beta4"
    const val coordinatorLayout = "1.1.0"
    const val viewPager2 = "1.0.0"
    const val legacySupport = "1.0.0"

    // Appcompat
    const val appcompat = "1.2.0-alpha02" // used because of 1.1.0 WebView bug

    // Jetpack:
    const val room = "2.2.5"
    const val lifecycle = "2.2.0"
    const val navigation = "2.3.0-alpha04"
    const val work = "2.3.4"
    const val camera2 = "1.0.0-beta01"
    const val camera = "1.0.0-alpha08"
}

object DependenciesAndroidX {

    // Ktx:
    const val coreKtx = "androidx.core:core-ktx:${VersionsAndroidX.coreKtx}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${VersionsAndroidX.fragmentKtx}"
    const val activityKtx = "androidx.activity:activity-ktx:${VersionsAndroidX.activityKtx}"
    const val collectionKtx = "androidx.collection:collection-ktx:${VersionsAndroidX.collectionKtx}"
    const val paletteKtx = "androidx.palette:palette-ktx:${VersionsAndroidX.paletteKtx}"

    // UI
    const val cardview = "androidx.cardview:cardview:${VersionsAndroidX.cardview}"
    const val vectorDrawable = "androidx.vectordrawable:vectordrawable:${VersionsAndroidX.vectorDrawable}"
    const val vectorDrawableAnimated = "androidx.vectordrawable:vectordrawable-animated:${VersionsAndroidX.vectorDrawable}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${VersionsAndroidX.constraintLayout}"
    const val coordinatorLayout = "androidx.coordinatorlayout:coordinatorlayout:${VersionsAndroidX.coordinatorLayout}"
    const val viewPager2 = "androidx.viewpager2:viewpager2:${VersionsAndroidX.viewPager2}"
    const val legacySupport = "androidx.legacy:legacy-support-v4:${VersionsAndroidX.legacySupport}"

    // Appcompat
    const val appcompat = "androidx.appcompat:appcompat:${VersionsAndroidX.appcompat}"
    const val appcompatResources = "androidx.appcompat:appcompat-resources:${VersionsAndroidX.appcompat}"

    // Jetpack:
    const val roomRuntime = "androidx.room:room-runtime:${VersionsAndroidX.room}"
    const val roomCompiler = "androidx.room:room-compiler:${VersionsAndroidX.room}"
    const val roomKtx = "androidx.room:room-ktx:${VersionsAndroidX.room}"
    const val roomRx = "androidx.room:room-rxjava2:${VersionsAndroidX.room}"

    const val lifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${VersionsAndroidX.lifecycle}"
    const val lifecycleViewModelSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${VersionsAndroidX.lifecycle}"
    const val lifecycleLiveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${VersionsAndroidX.lifecycle}"
    const val lifecycleRx = "androidx.lifecycle:lifecycle-reactivestreams-ktx:${VersionsAndroidX.lifecycle}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${VersionsAndroidX.lifecycle}"
    // alternative to lifecycle-compiler:
    const val lifecycleCommonJava8 = "androidx.lifecycle:lifecycle-common-java8:${VersionsAndroidX.lifecycle}"

    const val navigationRuntimeKtx = "androidx.navigation:navigation-runtime-ktx:${VersionsAndroidX.navigation}"
    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${VersionsAndroidX.navigation}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${VersionsAndroidX.navigation}"
    // Safe Args:
    const val navigationSafeArgsGradlePlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${VersionsAndroidX.navigation}"
    // Dynamic Feature Module Support:
    const val navigationDynamicFeatureModule = "androidx.navigation:navigation-dynamic-features-fragment:${VersionsAndroidX.navigation}"

    const val workRuntimeKtx = "androidx.work:work-runtime-ktx:${VersionsAndroidX.work}"
    const val workRx = "androidx.work:work-rxjava2:${VersionsAndroidX.work}"
    const val workGCM = "androidx.work:work-gcm:${VersionsAndroidX.work}"

    const val camera2 = "androidx.camera:camera-camera2:${VersionsAndroidX.camera2}"
    const val cameraLifecycle = "androidx.camera:camera-lifecycle:${VersionsAndroidX.camera2}"
    const val cameraView = "androidx.camera:camera-view:${VersionsAndroidX.camera}"
    const val cameraExtLib = "androidx.camera:camera-extensions:${VersionsAndroidX.camera}"
}