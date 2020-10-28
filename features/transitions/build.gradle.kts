plugins{
    id("com.android.library")
}
apply(from = project.file("${project.rootDir}/build-feature-dependencies.gradle.kts"))
apply(from = project.file("${project.rootDir}/build-navigation-dependencies.gradle.kts"))

dependencies {

}
