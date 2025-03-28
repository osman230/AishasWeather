pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencyResolutionManagement {
        repositories {
            google()
            mavenCentral()

        }
    }

    rootProject.name = "AishasWeather"
    include(":app")
}
