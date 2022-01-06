package com.inclutab.citizenspace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.inclutab.citizenspace.model.Citizen

class dataForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_form)

        val nameField: TextView= findViewById(R.id.name_input_edit_field)
        val addressField: TextView= findViewById(R.id.address_input_edit_field)
        val ageField: TextView= findViewById(R.id.age_input_edit_field)
        val occupationField: TextView= findViewById(R.id.occupation_input_edit_field)
        val maritalField: TextView= findViewById(R.id.marital_input_edit_field)

        val addButton : Button = findViewById(R.id.add_button)

        addButton.setOnClickListener {
            val name:String = nameField.text.toString()
            val address:String = addressField.text.toString()
            val  age: String = ageField.text.toString()
            val occupation:String = occupationField.text.toString()
            val marital :String = maritalField.text.toString()

        }

        //        val dataBase = Room.databaseBuilder(
//            applicationContext,
//            CitizenDatabase::class.java,
//            "citizen_db").build()
    }
}