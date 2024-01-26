package com.fmunmar310.practicacorrutinas.practica2.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class BotonesViewModel (application: Application): AndroidViewModel(application){
    fun bloqueoApp(){
       Thread.sleep(5000)
    }

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