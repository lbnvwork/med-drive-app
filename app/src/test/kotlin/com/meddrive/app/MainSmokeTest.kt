package com.meddrive.app

import com.meddrive.data.InMemoryAppInfoRepository
import kotlin.test.Test
import kotlin.test.assertEquals

class MainSmokeTest {
    @Test
    fun `repository is wired for the app entry point`() {
        assertEquals("MedDrive dev", InMemoryAppInfoRepository().current().displayName())
    }
}
