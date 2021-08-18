package com.example.vmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var txtContador: EditText
    lateinit var btnDados: Button
    lateinit var btnMostrar: Button //Dados criados no layout


    var contador: Int = 0 //Valor inicial do contador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDados()
        initContador()
        initClick()

        validaContador()
    }

    private fun validaContador() {
        if (contador>5){
            contador = 0
        }
    }

    private fun initClick() {
        btnDados.setOnClickListener{
            contador++
            validaContador()
            initContador()
        }// Função de clicar no botão dados e adicionar +1 ao valor original

        btnMostrar.setOnClickListener{
            Toast.makeText(this, "Valor Contador: ${contador.toString()}", Toast.LENGTH_SHORT).show()
        }//Função de exibir mensagem de resultado ao clicados no btMostrar
    }

    private fun initContador() {
        txtContador.setText(contador.toString()) //Inicia o contador
    }

    private fun initDados() {
        txtContador = findViewById(R.id.txtContador)
        btnDados = findViewById(R.id.btnDados)
        btnMostrar = findViewById(R.id.btnMostrar) //Realizada importação dos itens que serão usados na tela
    }


}