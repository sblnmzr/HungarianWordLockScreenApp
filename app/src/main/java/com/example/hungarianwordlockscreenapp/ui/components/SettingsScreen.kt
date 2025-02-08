package com.example.hungarianwordlockscreenapp.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SettingsScreen(onFrequencyChange: (Int) -> Unit) {
    var selectedFrequency by remember { mutableStateOf(1) }
    val frequencies = listOf(30, 60, 300) // in seconds

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Kelime Değişim Sıklığı", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(16.dp))

        frequencies.forEach { frequency ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (selectedFrequency == frequency),
                    onClick = {
                        selectedFrequency = frequency
                        onFrequencyChange(frequency)
                    }
                )
                Text("$frequency saniye")
            }
        }
    }
}