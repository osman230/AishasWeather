plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("org.jetbrains.kotlin.jvm") version "2.1.20"
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}