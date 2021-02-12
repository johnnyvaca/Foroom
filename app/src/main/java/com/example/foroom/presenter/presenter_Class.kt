package com.example.foroom.presenter

import android.content.Context
import com.example.foroom.model.*
import com.example.foroom.view.view_Interface
import com.google.gson.Gson

class presenter_Class(var view:view_Interface) : presenter_Interface{
    var varModel : model_Interface = model_Class() /// CREATION DE L'OBJET DEPUIS LE MODEL
    override fun getMessageFromModel(){
        //TODO("Not yet implemented")
        val message = varModel.getMessage() // INITIALISATION DU MESSAGE DU MODEL

        view.showMessage(message) // ECRIT LE MESSAGE DU MODEL


        val newMessage = varModel.getNewMessage()
        view.showNew(newMessage)
        
    }



}