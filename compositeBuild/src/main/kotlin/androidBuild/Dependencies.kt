package androidBuild

object Dependencies {

    //Plugins
    const val android_build_tools = "com.android.tools.build:gradle:${Versions.android_build_tools}"

    //Kotlin
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    //Androidx
    const val app_compat = "androidx.appcompat:appcompat:${Versions.app_compat}"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"

    //Material
    const val material = "com.google.android.material:material:${Versions.material}"

    //Test
    const val junit = "junit:junit:${Versions.junit}"

}