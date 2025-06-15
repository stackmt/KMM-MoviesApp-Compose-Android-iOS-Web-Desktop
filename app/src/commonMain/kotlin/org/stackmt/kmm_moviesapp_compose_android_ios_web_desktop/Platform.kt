package org.stackmt.kmm_moviesapp_compose_android_ios_web_desktop

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform