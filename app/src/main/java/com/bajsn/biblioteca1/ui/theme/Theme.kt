package com.bajsn.biblioteca1.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = BibPrimary,
    onPrimary = BibOnPrimary,
    primaryContainer = BibPrimaryContainer,
    onPrimaryContainer = BibOnPrimaryContainer,
    secondary = BibSecondary,
    onSecondary = BibOnSecondary,
    secondaryContainer = BibSecondaryContainer,
    onSecondaryContainer = BibOnSecondaryContainer,
    tertiary = BibTertiary,
    onTertiary = BibOnTertiary,
    background = BibBackground,
    onBackground = BibOnBackground,
    surface = BibSurface,
    onSurface = BibOnSurface,
    surfaceVariant = BibSurfaceVariant,
    onSurfaceVariant = BibOnSurfaceVariant,
    outline = BibOutline
)

private val DarkColorScheme = darkColorScheme(
    primary = BibPrimaryContainer,
    onPrimary = BibOnPrimaryContainer,
    primaryContainer = BibPrimary,
    onPrimaryContainer = BibOnPrimary,
    secondary = BibSecondaryContainer,
    onSecondary = BibOnSecondaryContainer,
    secondaryContainer = BibSecondary,
    onSecondaryContainer = BibOnSecondary,
    tertiary = BibTertiary,
    onTertiary = BibOnTertiary,
    background = Color(0xFF161312),
    onBackground = BibSurfaceVariant,
    surface = Color(0xFF161312),
    onSurface = BibSurfaceVariant,
    surfaceVariant = Color(0xFF2A2421),
    onSurfaceVariant = Color(0xFFD5CCC6),
    outline = BibOutline
)

@Composable
fun Biblioteca1Theme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
