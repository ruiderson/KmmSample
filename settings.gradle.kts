pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "KmmSample"

includeBuild("compositeBuild")

include(":androidApp")
include(":shared")

