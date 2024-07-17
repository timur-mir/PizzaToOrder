package home.howework.codapizza.ui.theme


import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.MaterialTheme


import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) = MaterialTheme(
    colorScheme = lightColorScheme(
        primary = Color(0xFFAD2A01),
        onPrimary = Color(0xFFFCFBFD),
        primaryContainer = Color(0xFF53D1EC),
        inversePrimary = Color(0xF59BC592),
        secondary = Color(0xFF112666),
        onSecondary = Color(0xFF15ccff),
        secondaryContainer = Color(0xFFFF5722),
        onSecondaryContainer = Color(0xFFCEB8F5),
        tertiary = Color(0xFF724E19),
        onTertiary = Color(0xa7f1f64f),
        tertiaryContainer = Color(0xFF179933),
        onTertiaryContainer = Color(0xFF2B0E5E),
        background = Color(0xFF009688),
        onBackground = Color(0xFFFFEB3B),
        surface = Color(0xFF792F48),
        onSurface = Color(0xFFD1D8D6),
        surfaceVariant = Color(0x447EB6DB),
        onSurfaceVariant = Color(0xFF260563),
        surfaceTint = Color(0xFF4E2634),
        inverseSurface = Color(0xFF04525C),
        inverseOnSurface = Color(0xFF439B92),
        error = Color(0xFF849B6A),
        onError = Color(0xFFB71d45),
        errorContainer = Color(0xFF025661),
        onErrorContainer = Color(0xaad2ffa0),
        outline = Color(0xFFFF9800),
        outlineVariant = Color(0xFFAD3C33)

    )
) {
    content()
}
