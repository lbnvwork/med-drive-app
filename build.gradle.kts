plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.ktlint) apply false
}

allprojects {
    group = "com.meddrive"
    version = "0.1.0"

    repositories {
        mavenCentral()
    }
}
