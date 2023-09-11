package com.example.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Pantalla2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)

    }

    //Funciones para cambios de pantalla

    fun ingresarPeach(view: View?) {
        val intent = Intent(
            this,
            PantallaPeach::class.java
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