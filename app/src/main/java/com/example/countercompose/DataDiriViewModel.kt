package com.example.countercompose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class DataDiriViewModel : ViewModel() {
    // Menyimpan state dari input form
    var nama by mutableStateOf("")
    var umur by mutableStateOf("")
}