package com.meddrive.app

import com.meddrive.data.InMemoryAppInfoRepository

fun main() {
    println(InMemoryAppInfoRepository().current().displayName())
}
