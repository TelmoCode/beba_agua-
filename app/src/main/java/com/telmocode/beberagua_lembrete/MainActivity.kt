package com.telmocode.beberagua_lembrete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var editPeso: EditText
    private lateinit var editIdade: EditText
    private lateinit var btn_calc: Button
    private lateinit var txtResultadoMl: TextView
    private lateinit var btn_refresh: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        iniciarComponentes()

        btn_calc.setOnClickListener {
            if(editPeso.text.toString().isEmpty()){
                Toast.makeText(this,R.string.touch_Peso, Toast.LENGTH_SHORT).show()


            }else if(editIdade.text.toString().isEmpty()) {
                Toast.makeText(this, R.string.touch_idade, Toast.LENGTH_SHORT).show()

            }
        }

    }
    private fun iniciarComponentes(){
        editPeso = findViewById(R.id.ipt_peso)
        editIdade = findViewById(R.id.ipt_idade)
        btn_calc = findViewById(R.id.btn_calc)
        txtResultadoMl = findViewById(R.id.resultado_ml)
        btn_refresh = findViewById(R.id.refresh)
    }

}