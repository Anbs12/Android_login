package com.example.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var usuarioEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Anubis

        usuarioEditText = findViewById(R.id.usuarioText)
        passwordEditText = findViewById(R.id.passText)
        loginButton = findViewById(R.id.btnIngresar)

        //variable asignada para que busque el ID del boton para cerrar App
        val button = findViewById<Button>(R.id.btnSalir)

        //boton ingresar seteado
        loginButton.setOnClickListener {
            ingresar()
        }

        //boton para salir seteado
        button.setOnClickListener {
            finishAffinity()
        }
    }

    //Funcion para validar inicio de sesion
    private fun ingresar() {

        fun pantallaLuigi() {
            val intent = Intent(this, Pantalla2::class.java)
            startActivity(intent)
        }

        val usuario = usuarioEditText.text.toString()
        val clave = passwordEditText.text.toString()

        // Verificar si los datos ingresados coinciden
        if (usuario == "alumno" && clave == "1234") {
            // Autenticación exitosa
            Toast.makeText(this, "Ingreso Correcto.", Toast.LENGTH_SHORT).show()
            pantallaLuigi()
        } else {
            // Autenticación mala
            Toast.makeText(this, "Usuario incorrecto.", Toast.LENGTH_SHORT).show()
        }


    }







}