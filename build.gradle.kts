plugins {
    kotlin("multiplatform") version "1.3.40"
    id("org.jetbrains.kotlin.native.cocoapods") version "1.3.40"
}

//for CocoaPods
version = "1.0"

repositories {
    mavenCentral()
}

kotlin {
    cocoapods {
        // Configure fields required by CocoaPods.
        summary = "SwiftUi Destop Test Project"
        homepage = "https://github.com/luca992/SwiftUi-Destop-Test-Project"
    }

    targets {
        macosX64()
        iosArm32()
        iosX64()
        iosArm64()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-common:1.3.40")
            }
        }
    }


}

// Use the following Gradle tasks to run your application:
// :runHelloWorldAppReleaseExecutableHelloWorld - without debug symbols
// :runHelloWorldAppDebugExecutableHelloWorld - with debug symbols
