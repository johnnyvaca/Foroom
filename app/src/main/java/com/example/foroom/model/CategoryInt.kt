package com.example.foroom.model

import android.content.Context
import org.json.JSONArray


interface CategoryInt {

    fun getCategories(file: String) :  JSONArray
}