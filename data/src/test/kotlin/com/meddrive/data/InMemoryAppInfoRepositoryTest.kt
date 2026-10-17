package com.meddrive.data

import com.meddrive.core.AppInfo
import kotlin.test.Test
import kotlin.test.assertEquals

class InMemoryAppInfoRepositoryTest {
    @Test
    fun `returns provided app info`() {
        val repo = InMemoryAppInfoRepository(AppInfo("MedDrive", "1.2.3"))

        assertEquals("MedDrive 1.2.3", repo.current().displayName())
    }
}
