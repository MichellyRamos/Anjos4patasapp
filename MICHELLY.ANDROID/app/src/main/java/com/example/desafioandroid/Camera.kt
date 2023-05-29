package com.example.desafioandroid

import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
// Importações necessárias para utilizar as classes e recursos utilizados no código.

class Camera : AppCompatActivity() {
// Definição da classe MainActivity que estende a classe AppCompatActivity.

    lateinit var imageView: ImageView
    lateinit var button: Button
    val REQUEST_IMAGE_CAPTURE = 1000
    // Declaração das variáveis.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        // Método chamado quando a atividade é criada. Define o layout da atividade.

        imageView = findViewById(R.id.imageView2)
        button = findViewById(R.id.button3)
        // Associação das variáveis aos elementos do layout.

        button.setOnClickListener{
            val takePictureIntent = Intent (MediaStore.ACTION_IMAGE_CAPTURE)
            // Cria uma intenção para capturar uma imagem.

            try {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
                // Inicia a atividade para capturar a imagem.
            } catch (e: ActivityNotFoundException){
                Toast.makeText(this,"Error:" + e.localizedMessage, Toast.LENGTH_SHORT).show()
                // Exibe uma mensagem de erro caso o aplicativo de câmera não esteja disponível.
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode ==  RESULT_OK){
            val imageBitmap = data?.extras?.get("data") as Bitmap
            imageView.setImageBitmap(imageBitmap)
            // Exibe a imagem capturada no ImageView.
        } else{
            super.onActivityResult(requestCode, resultCode, data)
            // Chama o método da superclasse caso o resultado não seja OK.
        }
    }
}
