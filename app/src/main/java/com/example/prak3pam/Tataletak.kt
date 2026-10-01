package com.example.prak3pam

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prak3pam.ui.theme.Prak3PAMTheme

@Composable
//
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Logo",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Praktikum PAM",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Nama: Maulina Khamidah - NIM: 20220140221")
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Kiri")
            Text(text = "Kanan")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { }) {
            Text("Klik Saya")
        }
    }
}

@Composable
fun ItemCard(nama: String) {
    Card(modifier = Modifier.padding(8.dp)) {
        Text(text = nama, modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun TataletakPreview() {
    Prak3PAMTheme {
        TataletakBoxColumnRow()
    }
}