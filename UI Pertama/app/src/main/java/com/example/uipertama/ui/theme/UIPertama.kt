package com.example.uipertama.ui.theme

import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Activitaspertama(modifier: Modifier){
    Column ( modifier = modifier.padding(top=110.dp)
        .fillMaxSize(),
        horizontalAligment = Alignment.CenterHorizontally

    ){
        text(stringResource(R.string.prodi),
            frontSize = 35.sp,
            fontWeight = FontWeight.Bold)
        Text(StringResource(R.string.univ),
            fontSize = 22.sp
        spacer(modifier = modifier.height(25.sp)
        card (modifier = modifier)
                .fillmaxsize(if)
                    .padding(12.dp),
                    colors = CardDefaults.cardColors()
    }
}