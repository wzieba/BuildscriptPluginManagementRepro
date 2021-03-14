pluginManagement {
    plugins {
        kotlin("multiplatform") version "1.4.31"
        kotlin("native.cocoapods") version "1.4.31"
        id("com.squareup.sqldelight") version "1.4.4"
    }
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }

}
rootProject.name = "MyApplication"

include(":shared")
