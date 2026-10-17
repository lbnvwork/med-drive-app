package com.meddrive.core

import kotlin.test.Test
import kotlin.test.assertEquals

class AppInfoTest {
    @Test
    fun `display name joins name and version`() {
        assertEquals("MedDrive 0.1.0", AppInfo("MedDrive", "0.1.0").displayName())
    }
}
