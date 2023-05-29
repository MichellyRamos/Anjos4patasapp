package com.example.desafioandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)
        val botaoEntrar = findViewById<Button>(R.id.button)
        botaoEntrar.setOnClickListener {
            trocaTela()
        }
    }
    fun trocaTela () {
            val troca = Intent(this,tela_perfil::class.java)
            startActivity(troca)
        }
    }
