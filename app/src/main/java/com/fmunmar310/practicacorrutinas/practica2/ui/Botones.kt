package com.fmunmar310.practicacorrutinas.practica2.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Botones(botonesViewModel: BotonesViewModel){
    val colorFondo: Int by botonesViewModel.colour.observeAsState(initial = 1)
    val result: String by botonesViewModel.resultState.observeAsState(initial = "Respuesta de la API ()")
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Button(
            onClick = {botonesViewModel.cambiarColor()},
            modifier = Modifier.wrapContentSize(),
            colors = ButtonDefaults.buttonColors(
                containerColor = if(colorFondo == 1) Color.Red
                else Color.Blue)
        ){
            Text(text = "Cambiar Color")
        }
        Text(text = result)
        Button(
            onClick = {botonesViewModel.fetchData() },
            modifier = Modifier.wrapContentSize(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue)
        ){
            Text(text = "Llamar Api")
        }
    }
}

