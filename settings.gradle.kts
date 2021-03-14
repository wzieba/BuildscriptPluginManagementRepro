pluginManagement {
    plugins {
        kotlin("multiplatform") version "1.4.31"
        kotlin("native.cocoapods") version "1.4.31"
    }
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }

}
rootProject.name = "MyApplication"

include(":shared")
