package com.example.hungarianwordlockscreenapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun LockScreenWordDisplay(hungarianWord: String, turkishTranslation: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = hungarianWord,
            color = Color.White,
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = turkishTranslation,
            color = Color.White,
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}