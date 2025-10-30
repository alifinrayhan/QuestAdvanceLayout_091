package com.example.questuserinput.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import java.lang.reflect.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.sync.Mutex

@Composable
fun FormDataDiri(modifier: Modifier
){

    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember() {mutableStateOf("")}
    var textJK by remember { mutableStateOf("") }

    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }



}