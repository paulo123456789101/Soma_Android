package com.example.soma_atual

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referências aos elementos do layout
        val num1Field = findViewById<EditText>(R.id.num1)
        val num2Field = findViewById<EditText>(R.id.num2)
        val btnSomar = findViewById<Button>(R.id.btnSomar)
        val resultadoView = findViewById<TextView>(R.id.resultado)

        // Ação do botão de soma
        btnSomar.setOnClickListener {
            // Pegar os números dos campos de texto e convertê-los para inteiros
            val num1 = num1Field.text.toString().toIntOrNull() ?: 0
            val num2 = num2Field.text.toString().toIntOrNull() ?: 0

            // Realizar a soma
            val soma = num1 + num2

            // Exibir o resultado
            resultadoView.text = "Resultado: $soma"
        }
    }
}