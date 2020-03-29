object VersionsTesting {

    const val junit = "4.12"
    const val androidxTest = "1.1.1"
    const val androidxEspressoTest = "3.1.1"
    const val mockito = "2.21.0"
    const val mockitoAndroid = "2.19.0"
    const val powerMock = "2.0.0"
}

object DependenciesTesting {

    // unit test
    const val junit = "junit:junit:${VersionsTesting.junit}"
    const val powerMockMockito = "org.powermock:powermock-api-mockito2:${VersionsTesting.powerMock}"
    const val powerMockJunit = "org.powermock:powermock-module-junit4:${VersionsTesting.powerMock}"

    // ui test
    const val mockito = "org.mockito:mockito-core:${VersionsTesting.mockito}"
    const val mockitoAndroid = "org.mockito:mockito-android:${VersionsTesting.mockitoAndroid}"

    const val androidxTestJunit = "androidx.test.ext:junit:${VersionsTesting.androidxTest}"

    const val androidxRoomTesting = "androidx.room:room-testing:${VersionsAndroidX.room}"
    const val androidxNavigationTesting = "androidx.navigation:navigation-testing:${VersionsAndroidX.navigation}"
    const val androidxWorkTesting = "androidx.work:work-testing:${VersionsAndroidX.work}"

    const val espresso = "androidx.test.espresso:espresso-core:${VersionsTesting.androidxEspressoTest}"
}