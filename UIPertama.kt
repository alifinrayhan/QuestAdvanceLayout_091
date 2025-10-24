package com.example.uipertama.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uipertama.R

@Composable
fun Activitaspertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 110.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(25.dp))
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ) {
            Row(
                modifier = Modifier.padding(5.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val gambar = painterResource(R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(5.dp)
                )
                Spacer(modifier = Modifier.width(38.dp))
                Column {
                    Text(
                        text = stringResource(R.string.nama),
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 5.dp) // Memberi jarak bawah
                    )
                    Text(
                        text = stringResource(R.string.alamat),
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 5.dp) // Memberi jarak atas
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(5.dp),
                contentAlignment = Alignment.BottomEnd
                text = stringResource(R.string.copy),
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Black,
                modifier = Modifier.padding(5.dp)
            ) {

            }
        }
    }
}

// Card Kedua (Biru)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 6.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF0000FF) // Warna Biru
            )
        ) {


