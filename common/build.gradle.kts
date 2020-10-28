plugins {
    //id("com.android.library")
    id("common-android")
}

//apply(from =  project.file("${project.rootDir}/build-common-android.gradle.kts"))
//apply(from =  project.file("${project.rootDir}/build-common-dependencies.gradle.kts"))

dependencies {
    implementation(project(":navigation"))
}
