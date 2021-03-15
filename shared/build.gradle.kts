plugins {
    kotlin("multiplatform") version "1.4.31"
    kotlin("native.cocoapods") version "1.4.31"
    id("com.squareup.sqldelight")
}

version = "1.0"

kotlin {
    ios()
    cocoapods {
        ios.deploymentTarget = "13.5"

        summary = "CocoaPods test library"
        homepage = "https://github.com/JetBrains/kotlin"

        pod("AFNetworking") {
            source = git("https://github.com/AFNetworking/AFNetworking") {
                tag = "4.0.0"
            }
        }
    }
}
