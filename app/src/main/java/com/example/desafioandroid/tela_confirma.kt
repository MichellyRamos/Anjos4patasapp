package com.example.desafioandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class tela_confirma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_confirma)

        val telaConfirma = findViewById<Button>(R.id.button5)

        telaConfirma.setOnClickListener {
                val builder = AlertDialog.Builder(this)
                builder.setMessage("TROCANDO DE TELA")
                builder.setPositiveButton( "Aceito trocar de tela") { dialog, which ->
                    val intent = Intent(this, TelaInicial::class.java)
                    startActivity(intent)
                    finish()
                }
                builder.show()
        }



    }

   /* private fun mudanca() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("TROCANDO DE TELA")
        builder.setPositiveButton( "Aceito trocar de tela") { dialog, which ->
            finish()
        }
        builder.show()


    }*/
}