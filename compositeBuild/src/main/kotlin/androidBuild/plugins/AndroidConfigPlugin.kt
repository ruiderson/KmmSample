package androidBuild.plugins

import androidBuild.AndroidDefaultSetup
import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply

class AndroidConfigPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.apply(plugin = ANDROID_APPLICATION_PLUGIN_ID)
        target.apply(plugin = KOTLIN_ANDROID_PLUGIN_ID)

        setupDefaultConfig(target)
    }

    private fun setupDefaultConfig(project: Project) = with(project){
        if(plugins.hasPlugin(ANDROID_PLUGIN) ||
            plugins.hasPlugin(ANDROID_LIBRARY_PLUGIN)){

            extensions.findByType(AppExtension::class.java)?.let {
                AndroidDefaultSetup(it).setup()
            }
        }
    }

    companion object{
        private const val ANDROID_APPLICATION_PLUGIN_ID = "com.android.application"
        private const val KOTLIN_ANDROID_PLUGIN_ID = "org.jetbrains.kotlin.android"

        private const val ANDROID_PLUGIN = "android"
        private const val ANDROID_LIBRARY_PLUGIN = "android-library"
    }
}