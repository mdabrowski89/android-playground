plugins {
    id("com.android.library")
    id("kotlin-android")
}

dependencies {
    implementation(DependenciesCore.kotlinStd)

    implementation(DependenciesAndroidX.coreKtx)
    implementation(DependenciesAndroidX.appcompat)
    implementation(DependenciesAndroidX.constraintLayout)

    // Unit tests
    testImplementation(DependenciesTesting.junit)
    testImplementation(DependenciesTesting.mockito)

    // UI tests
    androidTestImplementation(DependenciesTesting.androidxTestJunit)
    androidTestImplementation(DependenciesTesting.espresso)
}
