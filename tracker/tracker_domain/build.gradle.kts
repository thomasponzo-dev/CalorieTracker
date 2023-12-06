plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "com.thomasponzo.tracker_domain"
}

dependencies {
    implementation(project(Modules.core))
    implementation(Coroutines.coroutines)
}