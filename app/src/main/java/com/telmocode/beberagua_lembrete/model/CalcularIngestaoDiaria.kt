package com.telmocode.beberagua_lembrete.model

class CalcularIngestaoDiaria {

    private val ML_JOVEN = 40.0
    private val ML_ADULTO = 35.0
    private val ML_IDOSO = 30.0
    private val ML_MAIS_DE_65_ANOS = 25.0

    private var resultadoMl = 0.0
    private var resultado_ml_total = 0.0

    fun calcularTotalMl(peso: Double, idade: Int){

        if (idade <= 17){
            resultadoMl = peso * ML_JOVEN
            resultado_ml_total = resultadoMl
        }else if (idade <= 55){
            resultadoMl = peso * ML_ADULTO
            resultado_ml_total = resultadoMl
        }else if (idade <= 65){
            resultadoMl = peso * ML_IDOSO
            resultado_ml_total = resultadoMl
        }else{
            resultadoMl = peso * ML_MAIS_DE_65_ANOS
            resultado_ml_total = resultadoMl
        }

    }

    fun resultadoTotal(): Double{
        return  resultado_ml_total
    }

}