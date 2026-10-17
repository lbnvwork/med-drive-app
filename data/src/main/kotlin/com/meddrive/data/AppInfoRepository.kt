package com.meddrive.data

import com.meddrive.core.AppInfo

/** Источник сведений о приложении. Реальные источники (API, кэш) появятся в задачах спринтов. */
interface AppInfoRepository {
    fun current(): AppInfo
}

/** Заглушка каркаса: отдаёт значения по умолчанию. */
class InMemoryAppInfoRepository(
    private val info: AppInfo = AppInfo(name = "MedDrive", version = "dev"),
) : AppInfoRepository {
    override fun current(): AppInfo = info
}
