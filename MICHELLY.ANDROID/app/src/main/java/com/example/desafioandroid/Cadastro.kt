package com.example.desafioandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val bt_segunda_tela = findViewById<Button>(R.id.button2)

        bt_segunda_tela.setOnClickListener {
            IrParaSegundaTela()
        }

    }
    private fun IrParaSegundaTela(){
        val Camera = Intent(this,Camera::class.java)
        startActivity(Camera)
    }
    }
