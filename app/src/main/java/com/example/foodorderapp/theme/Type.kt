package com.example.foodorderapp.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.foodorderapp.R

// Set of Material typography styles to start with

val poppinsRegular = FontFamily(Font(R.font.poppins_regular, FontWeight.Normal))
val poppinsBold = FontFamily(Font(R.font.poppins_bold, FontWeight.Bold))
val poppinsExtraBold = FontFamily(Font(R.font.poppins_extra_bold, FontWeight.ExtraBold))
val poppinsSemiBold = FontFamily(Font(R.font.poppins_semi_bold, FontWeight.SemiBold))

val gothicLight = FontFamily(Font(R.font.gothica_light, FontWeight.Light))
val gothicRegular = FontFamily(Font(R.font.gothic_regular, FontWeight.Normal))
val gothicSemiBold = FontFamily(Font(R.font.gothic_semi_bold, FontWeight.SemiBold))
val gothicBold = FontFamily(Font(R.font.gothic_bold, FontWeight.Bold))



val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = gothicLight,
        fontWeight = FontWeight.Bold,
        fontSize = 34.sp,
        lineHeight = 40.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = gothicRegular,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        lineHeight = 36.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = gothicRegular,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    titleLarge = TextStyle(
        fontFamily = gothicRegular,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    titleMedium = TextStyle(
        fontFamily = gothicRegular,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),
    titleSmall = TextStyle(
        fontFamily = gothicRegular,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = gothicRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = gothicRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = gothicRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),
    labelLarge = TextStyle(
        fontFamily = gothicRegular,
        fontWeight = FontWeight.Medium,
    ),
    labelMedium = TextStyle(
        fontFamily = gothicRegular,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp
    ),
    labelSmall = TextStyle(
        fontFamily = gothicRegular,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp
    )
)