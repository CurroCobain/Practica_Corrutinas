package com.fmunmar310.practicacorrutinas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fmunmar310.practicacorrutinas.practica2.ui.Botones
import com.fmunmar310.practicacorrutinas.practica2.ui.BotonesViewModel
import com.fmunmar310.practicacorrutinas.ui.theme.PracticaCorrutinasTheme

class MainActivity : ComponentActivity() {
    private val botonesViewModel: BotonesViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticaCorrutinasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Botones(botonesViewModel = botonesViewModel)
                }
            }
        }
    }
}

