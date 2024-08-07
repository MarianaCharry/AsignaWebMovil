package com.example.asignaweb

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class iniciarSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_iniciar_sesion)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun recuperar_contrasena(view: View){
        var intent= Intent(application,recuperar_password::class.java)
        startActivity(intent)
    }

    fun crear_cuenta(view: View){
        var intent= Intent(application,crear_cuenta::class.java)
        startActivity(intent)
    }

    fun espacios(view: View){
        var intent= Intent(application,espacios::class.java)
        startActivity(intent)
    }
}