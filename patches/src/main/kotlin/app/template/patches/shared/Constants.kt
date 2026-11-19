package app.template.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {
    private val MYSPOTI_240_TARGETS = listOf(AppTarget(version = "2.4.0", isExperimental = false))

    val MYSPOTI_STABLE = Compatibility(
        name = "MySpoti",
        packageName = "app.myspoti.stable",
        apkFileType = ApkFileType.APK,
        appIconColor = 0x1DB954,
        targets = MYSPOTI_240_TARGETS,
    )

    val MYSPOTI_REVERA = Compatibility(
        name = "MySpoti",
        packageName = "app.revera.dev",
        apkFileType = ApkFileType.APK,
        appIconColor = 0x1DB954,
        targets = MYSPOTI_240_TARGETS,
    )

    val MYSPOTI_BRANDING_VARIANTS = listOf(
        Compatibility(
            name = "MySpoti",
            packageName = "app.myspoti",
            apkFileType = ApkFileType.APK,
            appIconColor = 0x1ED760,
            targets = listOf(AppTarget(version = null)),
        ),
        Compatibility(
            name = "MySpoti",
            packageName = "app.myspoti.stable",
            apkFileType = ApkFileType.APK,
            appIconColor = 0x1ED760,
            targets = listOf(AppTarget(version = null)),
        ),
        Compatibility(
            name = "MySpoti",
            packageName = "app.revera.dev",
            apkFileType = ApkFileType.APK,
            appIconColor = 0x1ED760,
            targets = listOf(AppTarget(version = null)),
        ),
    )
}
