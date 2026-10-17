package com.meddrive.core

/** Сведения о приложении: используются в UI и как smoke-объект каркаса. */
data class AppInfo(val name: String, val version: String) {
    fun displayName(): String = "$name $version"
}
