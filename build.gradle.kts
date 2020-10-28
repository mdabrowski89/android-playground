// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
        classpath("com.android.tools.build:gradle:4.1.0")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.1")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        apply(from = "$rootDir/ktlint.gradle.kts")
    }
}

subprojects {
    tasks.withType(Test::class) {
        maxParallelForks = Runtime.getRuntime().availableProcessors().div(2) ?: 1
    }
}

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}
