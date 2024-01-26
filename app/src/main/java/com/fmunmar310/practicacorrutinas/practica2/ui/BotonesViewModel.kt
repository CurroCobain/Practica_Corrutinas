package com.fmunmar310.practicacorrutinas.practica2.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class BotonesViewModel (application: Application): AndroidViewModel(application){
   /* private val _fondoColor = MutableLiveData<Boolean>()
    val fondoColor: LiveData<Boolean> = _fondoColor

    fun cambiarColor():Boolean{
        _fondoColor.value = !_fondoColor.value!!
        return _fondoColor.value!!
    }

    */

    fun cambiarColor(value: Int):Int{
        val newValue: Int
        if(value ==1){
            newValue = value+1
        }else{
            newValue = value-1
        }
        return newValue
    }
}