package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PantallaPeach : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_peach)
    }

    //Funciones para cambios de pantalla

    fun ingresarLuigi(view: View?) {
        val intent = Intent(
            this,
            Pantalla2::class.java
        )
        startActivity(intent)
    }

    fun ingresarDaisy(view: View?) {
        val intent = Intent(
            this,
            PantallaDaisy::class.java
        )
        startActivity(intent)
    }

    fun ingresarMario(view: View?) {
        val intent = Intent(
            this,
            PantallaMario::class.java
        )
        startActivity(intent)
    }

    fun ingresarInicio(view: View?) {
        val intent = Intent(
            this,
            MainActivity::class.java
        )
        startActivity(intent)
    }
}