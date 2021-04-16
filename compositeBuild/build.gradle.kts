plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    google()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
    implementation("com.android.tools.build:gradle:4.2.0-rc01")
}

gradlePlugin {
    plugins{
        create("android-config") {
            id = "android-config"
            implementationClass = "androidBuild.plugins.AndroidConfigPlugin"
        }
    }
}