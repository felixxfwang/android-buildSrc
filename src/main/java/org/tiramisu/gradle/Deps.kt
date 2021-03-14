package org.tiramisu.gradle

/**
 * @author felixxfwang
 */
object Deps {
    object Tiramisu {
        object Basic {
            const val animation = ":basic:animation"
            const val animation_lottie = ":basic:animation-lottie"
            const val http = ":basic:http"
            const val http_coroutine = ":basic:http_coroutine"
            const val image = ":basic:image"
            const val log = ":basic:log"
            const val log_xlog = ":basic:log-xlog"
            const val page_modular = ":basic:page-modular"
            const val page_modular_annotations = ":basic:page-modular-annotations"
            const val page_modular_processor = ":basic:page-modular-processor"
            const val permissions = ":basic:permissions"
            const val repository = ":basic:repository"
            const val route = ":basic:route"
            const val serializable = ":basic:serializable"
            const val storage = ":basic:storage"
            const val utils = ":basic:utils"
        }
        object Common {
            const val analytics = ":common:analytics"
            const val app_update = ":common:appupdate"
            const val base = ":common:base"
            const val biz_base = ":common:biz-base"
            const val config = ":common:config"
            const val crashlytics = ":common:crashlytics"
            const val feeds = ":common:feeds"
            const val list = ":common:list"
            const val modular = ":common:modular"
            const val navigation_ktx = ":common:navigation-ktx"
            const val player = ":common:player"
            const val webview = ":common:webview"
            const val widgets = ":common:widgets"
            const val repository_http = ":common:repository-http"
        }
    }
    
    object Plugins {
        const val gradle = "com.android.tools.build:gradle:4.1.2"
        const val gradle_versions = "com.github.ben-manes:gradle-versions-plugin:0.36.0"
        const val gms_oss_licenses = "com.google.android.gms:oss-licenses-plugin:0.10.2"
        const val gms_google_services = "com.google.gms:google-services:4.3.5"
        const val firebase_crashlytics = "com.google.firebase:firebase-crashlytics-gradle:2.5.1"
        const val maven_publish = "com.vanniktech:gradle-maven-publish-plugin:0.9.0"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_version}"
        const val androidx_navigation_safe_args = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.nav_version}"
    }
}