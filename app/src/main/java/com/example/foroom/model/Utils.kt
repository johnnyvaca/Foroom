package com.example.foroom.model

import android.content.Context
import android.util.Log
import java.io.IOException
class Utils {
    fun getAssetJsonData(context: Context,file : String): String? {
        var json = ""
        try {
            val stream = context.assets.open(file)
            val size = stream.available()
            val buffer = ByteArray(size)
            //stream.use { it.read(buffer) }
            stream.read(buffer)
            stream.close()
         //   json = String(buffer)
            json = String(buffer)
        } catch (ioException: IOException) {
          //  ioException.printStackTrace()
        }


        return json
    }
}