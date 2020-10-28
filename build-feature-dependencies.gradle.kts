plugins {
    id("kotlin-android")
}

apply(from =  project.file("${project.rootDir}/build-common-android.gradle.kts"))
apply(from =  project.file("${project.rootDir}/build-common-dependencies.gradle.kts"))

/*dependencies {
    implementation(project(":common"))
    implementation(project(":navigation"))
}*/
