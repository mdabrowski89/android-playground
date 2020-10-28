plugins {
    id("com.android.application")
}

apply(from = project.file("${project.rootDir}/build-common-android.gradle.kts"))
apply(from = project.file("${project.rootDir}/build-common-dependencies.gradle.kts"))

android {
    defaultConfig {
        //project.ext.appName = 'android-playground'
        applicationId = "pl.mobite.playground"
    }

    buildTypes {
        getByName("debug") {
            isDebuggable = true
            isMinifyEnabled = false
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-dev"
            //resValue "string", "app_name", "$project.ext.appName-dev"
        }
        getByName("release") {
            isMinifyEnabled = true
            //proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
            //resValue "string", "app_name", project.ext.appName
        }
    }
}

dependencies {
    implementation(project(":common"))
    implementation(project(":navigation"))
    implementation(project(":features:transitions"))
    implementation(project(":features:coroutines"))
}

/*
task addVersionNameAndCodeAndTimestampToApkFileName() {
    android.applicationVariants.all { variant ->
        variant.outputs.all { output ->
            if (variant.name != "debug") {
                def date = new Date().format("yyMMdd_HHmmss")
                def fileName = "${project.ext.appName}_${variant.name}_${variant.versionName}(${variant.versionCode})_${date}.apk"
                output.outputFileName = fileName
            }
        }
    }
}

gradle.taskGraph.whenReady {
    addVersionNameAndCodeAndTimestampToApkFileName
}*/
