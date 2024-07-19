package com.da_chelimo.generate.core.presentation.theme

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val lightAppColors = AppColors(
    mainBackground = Color.White,
    appOnMainBackground = MildBlue,
    plainOnMainBackground = DarkBlack
)

val darkAppColors = AppColors(
    mainBackground = DarkBlack,
    appOnMainBackground = MildBlue,
    plainOnMainBackground = Color.White
)

val LocalAppColors: ProvidableCompositionLocal<AppColors> = staticCompositionLocalOf { lightAppColors }

data class AppColors (
    val mainBackground: Color,
    val appOnMainBackground: Color,
    val plainOnMainBackground: Color,
)