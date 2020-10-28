plugins {
    id("com.android.library")
}

apply(from = project.file("${project.rootDir}/build-feature-dependencies.gradle.kts"))

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.5")
}