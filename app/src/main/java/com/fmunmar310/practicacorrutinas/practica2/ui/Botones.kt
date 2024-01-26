package com.fmunmar310.practicacorrutinas.practica2.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Botones(botonesViewModel: BotonesViewModel){
    var colorFondo by rememberSaveable {mutableStateOf(1)}
    var vecesPulsado by rememberSaveable { mutableStateOf(0) }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Button(
            onClick = {colorFondo = botonesViewModel.cambiarColor(colorFondo)},
            modifier = Modifier.wrapContentSize(),
            colors = ButtonDefaults.buttonColors(
                containerColor = if(colorFondo == 1) Color.Red
                else Color.Blue)
        ){
            Text(text = "Cambiar Color")
        }
        Text(text = "Respuesta de la Api ($vecesPulsado)")
        Button(
            onClick = {Thread.sleep(5000)
                      vecesPulsado++},
            modifier = Modifier.wrapContentSize(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue)
        ){
            Text(text = "Llamar Api")
        }

    }
}

