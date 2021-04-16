package androidBuild

import androidBuild.extensions.androidTest
import androidBuild.extensions.main
import androidBuild.extensions.test
import com.android.build.gradle.AppExtension

class AndroidDefaultSetup(
    private val android: AppExtension
){

    fun setup() = with(android){

        compileSdkVersion(Config.compileSdkVersion)
        defaultConfig{
            minSdkVersion(Config.minSdkVersion)
            targetSdkVersion(Config.targetSdkVersion)
        }

        sourceSets{
            main {
                java.srcDir(Config.srcDir)
            }

            test{
                java.srcDir(Config.testDir)
                java.srcDir(Config.sharedTestDir)
                resources.srcDir(Config.sharedTestResourcesDir)
            }

            androidTest{
                java.srcDir(Config.sharedTestDir)
                assets.srcDir(Config.sharedTestResourcesDir)
            }
        }

        compileOptions {
            sourceCompatibility = Config.javaVersion
            targetCompatibility = Config.javaVersion
        }

        testOptions{
            animationsDisabled = true

            with(unitTests){
                isIncludeAndroidResources = true
                isReturnDefaultValues = true
            }
        }

        buildTypes {
            getByName("debug") {
                isDebuggable = true
            }

            getByName("release") {
                isDebuggable = false
                isShrinkResources = false
                isMinifyEnabled = false
            }
        }
    }

}