package com.example.asignaweb

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class modulo_informacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_modulo_informacion)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun cambioAuditorio(view: View){
        var intent= Intent(application,infoAuditorio::class.java)
        startActivity(intent)
    }

    fun cambioBiblioteca(view: View){
        var intent= Intent(application,infoBiblioteca::class.java)
        startActivity(intent)
    }

    fun cambioCanchas(view: View){
        var intent= Intent(application,info_canchas::class.java)
        startActivity(intent)
    }

    fun cambioGimnasio(view: View){
        var intent= Intent(application,info_gimnasio::class.java)
        startActivity(intent)
    }

    fun cambiarMiPerfil(view: View){
        var intent= Intent(application,mi_perfil::class.java)
        startActivity(intent)
    }
}