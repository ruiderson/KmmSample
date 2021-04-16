package androidBuild

import org.gradle.api.JavaVersion

object Config {

    const val applicationId = "com.ruiderson.kmmsample.androidApp"
    const val versionCode = 1
    const val versionName = "1.0"

    const val compileSdkVersion = 30
    const val minSdkVersion = 24
    const val targetSdkVersion = 30

    val javaVersion = JavaVersion.VERSION_1_8

    const val srcDir = "src/main/kotlin"
    const val testDir = "src/test/kotlin"
    const val sharedTestDir = "src/sharedTest/kotlin"
    const val sharedTestResourcesDir = "src/sharedTest/resources"

}