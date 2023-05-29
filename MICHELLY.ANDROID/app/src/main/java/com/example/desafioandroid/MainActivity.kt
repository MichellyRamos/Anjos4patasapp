package com.example.desafioandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val goCadastro = findViewById<Button>(R.id.myButton)
        val trocaTela = findViewById<Button>(R.id.notButton)
        trocaTela.setOnClickListener {
            val intent = Intent (this,TelaInicial::class.java)
            startActivity(intent)
        }
        goCadastro.setOnClickListener {
            val intent = Intent (this,Cadastro::class.java)
            startActivity(intent)




        }
    }
}