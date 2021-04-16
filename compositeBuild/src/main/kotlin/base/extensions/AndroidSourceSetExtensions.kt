package base.extensions

import com.android.build.gradle.api.AndroidSourceSet
import org.gradle.api.NamedDomainObjectContainer

fun NamedDomainObjectContainer<AndroidSourceSet>.main(block: AndroidSourceSet.() -> Unit) = block(
    getByName("main")
)

fun NamedDomainObjectContainer<AndroidSourceSet>.test(block: AndroidSourceSet.() -> Unit) = block(
    getByName("test")
)

fun NamedDomainObjectContainer<AndroidSourceSet>.androidTest(block: AndroidSourceSet.() -> Unit) = block(
    getByName("androidTest")
)