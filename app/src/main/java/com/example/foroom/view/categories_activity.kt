package com.example.foroom.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.foroom.R
import com.example.foroom.model.Utils
import com.example.foroom.model.modelCategories
import com.example.foroom.providers.IDataProvider
import com.google.gson.Gson

class categories_activity : AppCompatActivity() {
//	private val dataProvider : IDataProvider // by inject()
	
	lateinit var option : Spinner
	lateinit var result : TextView
	lateinit var button2 : Button
	lateinit var button3 : Button
	
	override fun onCreate(savedInstanceState : Bundle?) {
		
		super.onCreate(savedInstanceState)
		
		setContentView(R.layout.activity_main)
		
		
		var util = Utils()
		var json = util.getAssetJsonData(getApplicationContext(), "categories.json")
		
		
		//  Log.d("COSA", categories.categories)
		option = findViewById(R.id.sp_option) as Spinner
		option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
			override fun onItemSelected(parent : AdapterView<*>?, view : View?, position : Int, id : Long) {
				//Toast.makeText(this, , Toast.LENGTH_SHORT).show()
				val intentMessages : Intent = Intent(this@categories_activity, messages_activity::class.java)
				
				if (position != 0) {
					startActivity(intentMessages)
				}
			}
			
			override fun onNothingSelected(parent : AdapterView<*>?) {
				TODO("Not yet implemented")
			}
		}
		val gson = Gson()
		var categories = gson.fromJson(json, modelCategories::class.java)
		println(categories)
		
		val arrayAdapter : ArrayAdapter<*>
		val personas = mutableListOf("Jeux Videos", "Informatique", "Cuisine")
		var datos = findViewById<ListView>(R.id.lista)
		
		var liste : ArrayList<modelCategories> = ArrayList()
		for (i in 0 .. 100 - 1) {
		
		}
		arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, personas)
		datos.adapter = arrayAdapter
		
		datos.setOnItemClickListener { parent, view, position, id ->
			
			// Toast.makeText(this, datos.text, Toast.LENGTH_SHORT).show()
			val intentTopics : Intent = Intent(this@categories_activity, topics_activity::class.java)
			startActivity(intentTopics)
		}
	}
}