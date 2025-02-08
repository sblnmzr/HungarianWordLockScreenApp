package com.example.hungarianwordlockscreenapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.example.hungarianwordlockscreenapp.ui.components.LockScreenWordDisplay
import com.example.hungarianwordlockscreenapp.ui.theme.HungarianWordLockScreenAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HungarianWordLockScreenAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    LockScreenWordDisplay()
                }
            }
        }
    }
}