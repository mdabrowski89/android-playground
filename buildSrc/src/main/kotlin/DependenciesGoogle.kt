object VersionsGoogle {

    const val material = "1.0.0"

    const val playServicesMaps = "15.0.1"
    const val playServicesLocation = "17.0.0"
    const val playServicesAds = "18.2.0"

    const val mapsUtils = "0.5+"

    const val firebaseMessaging = "20.0.0"

    const val googleServices = "4.3.2"
}

object DependenciesGoogle {

    const val material = "com.google.android.material:material:${VersionsGoogle.material}"

    const val playServicesMaps = "com.google.android.gms:play-services-maps:${VersionsGoogle.playServicesMaps}"
    const val playServicesLocation = "com.google.android.gms:play-services-location:${VersionsGoogle.playServicesLocation}"
    const val playServicesAds = "com.google.android.gms:play-services-ads:${VersionsGoogle.playServicesAds}"

    const val mapsUtils = "com.google.maps.android:android-maps-utils:${VersionsGoogle.mapsUtils}"

    const val firebaseMessaging = "com.google.firebase:firebase-messaging:${VersionsGoogle.firebaseMessaging}"

    const val googleServicesGradlePlugin = "com.google.gms:google-services:${VersionsGoogle.googleServices}"
}