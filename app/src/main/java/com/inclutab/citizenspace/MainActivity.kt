package com.inclutab.citizenspace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.room.Room
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.inclutab.citizenspace.db.CitizenDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataBase : CitizenDatabase = Room.databaseBuilder(
            applicationContext,
            CitizenDatabase::class.java,
            "citizen_db")
            .allowMainThreadQueries().build()

        val floatingButton = findViewById<FloatingActionButton>(R.id.fab)
        floatingButton.setOnClickListener {
            openDataForm()
        }

    }

    private fun openDataForm(){
        val intent = Intent(this, dataForm::class.java)
        startActivity(intent)
    }
}