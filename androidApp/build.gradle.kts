import androidBuild.Dependencies
import androidBuild.Config

plugins {
    id("android-config")
}

dependencies {
    implementation(project(":shared"))
    implementation(Dependencies.material)
    implementation(Dependencies.app_compat)
    implementation(Dependencies.constraint_layout)
}

android {
    defaultConfig {
        applicationId = Config.applicationId
        versionCode = Config.versionCode
        versionName = Config.versionName
    }
}