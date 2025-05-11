import kotlin.collections.emptyList

plugins {
    id("org.jetbrains.intellij") version "1.17.4"
    id("java")
}

group "com.adebesin"
version "2.04.2-SNAPSHOT"

java {
    sourceSets["main"].apply {
        java.srcDir(emptyList<String>())
        resources.srcDir("resources")
    }
}

repositories {
    mavenCentral()
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2022.1.1")
//    type.set("IU")
    type.set("IC") // Target IDE Platform
    updateSinceUntilBuild = false
    plugins.set(listOf(/* Plugin Dependencies */))
}
