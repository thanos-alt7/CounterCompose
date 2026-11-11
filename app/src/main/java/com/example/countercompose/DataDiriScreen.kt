package com.example.countercompose

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun DataDiriScreen(
    modifier: Modifier = Modifier,
    viewModel: DataDiriViewModel = viewModel() // Menggunakan ViewModel
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Data Diri",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        // Form Input Nama
        OutlinedTextField(
            value = viewModel.nama,
            onValueChange = { viewModel.nama = it },
            label = { Text("Masukkan Nama") },
            modifier = Modifier.fillMaxWidth()
        )

        // Form Input Umur
        OutlinedTextField(
            value = viewModel.umur,
            onValueChange = { viewModel.umur = it },
            label = { Text("Masukkan Umur") },
            modifier = Modifier.fillMaxWidth()
        )

        // Ringkasan hasil inputan akan muncul jika form tidak kosong
        if (viewModel.nama.isNotBlank() && viewModel.umur.isNotBlank()) {
            Text(
                text = "Nama saya \"${viewModel.nama}\" dan umur saya \"${viewModel.umur}\", Salam kenal!",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}