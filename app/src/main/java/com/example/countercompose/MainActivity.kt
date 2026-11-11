package com.example.countercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import com.example.countercompose.ui.theme.CounterComposeTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CounterComposeTheme {
                // State untuk mengatur halaman mana yang sedang aktif
                var currentScreen by rememberSaveable { mutableStateOf("Counter") }

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    // Logika pergantian halaman
                    if (currentScreen == "Counter") {
                        CounterApp(
                            modifier = Modifier.padding(innerPadding),
                            onNext = { currentScreen = "DataDiri" } // Ubah state saat diklik
                        )
                    } else {
                        DataDiriScreen(
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }
}
