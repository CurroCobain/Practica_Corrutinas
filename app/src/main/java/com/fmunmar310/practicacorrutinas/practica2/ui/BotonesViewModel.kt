package com.fmunmar310.practicacorrutinas.practica2.ui

import android.app.Application
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class BotonesViewModel (application: Application): AndroidViewModel(application){

    private val _colour = MutableLiveData<Int>(1)
    val colour: LiveData<Int> = _colour
    private var _callCount = 0
    private val _resultState = MutableLiveData<String>()
    val resultState: LiveData<String> = _resultState
    fun bloqueoApp(){
       Thread.sleep(5000)
    }
    fun fetchData() {
        _callCount= _callCount.plus(1)
        //Nos permite crear una corrutina desde un ViewModel
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                delay(5000)
                "Respuesta de la API ($_callCount)"
            }
            _resultState.value = result
        }
    }

    fun cambiarColor() {
        if(_colour.value!! ==1){
            _colour.value = _colour.value!! + 1
        }else{
            _colour.value = _colour.value!! - 1
        }
    }
}