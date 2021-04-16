package kmpBuild.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply

class KmpConfigPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.apply(plugin = KOTLIN_MULTIPLATFORM_PLUGIN_ID)
        target.apply(plugin = ANDROID_LIBRARY_PLUGIN_ID)
    }

    companion object{
        private const val KOTLIN_MULTIPLATFORM_PLUGIN_ID = "org.jetbrains.kotlin.multiplatform"
        private const val ANDROID_LIBRARY_PLUGIN_ID = "com.android.library"
    }
}