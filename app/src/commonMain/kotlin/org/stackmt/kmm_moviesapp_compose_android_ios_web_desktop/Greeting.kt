package org.stackmt.kmm_moviesapp_compose_android_ios_web_desktop

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}