package com.example.meuprimeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val edtPeso: EditText = findViewById(R.id.edtPeso)
        val edtAltura: EditText = findViewById(R.id.edtAltura)


        btnCalcular.setOnClickListener{

            val alturaStr = edtAltura.text.toString()
            val pesoStr = edtPeso.text.toString()

            if(alturaStr.isNotEmpty() && pesoStr.isNotEmpty()){

                val altura: Float = alturaStr.toFloat()
                var peso: Float = pesoStr.toFloat()

                var alturaFinal: Float = altura * altura
                var result: Float = peso / alturaFinal



                val intent = Intent(this, ResultActivity::class.java)
                    .apply {
                        putExtra("Extra_Result", result)
                    }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Prencher todos os campos" , Toast.LENGTH_LONG).show()
            }

        }





    }
}