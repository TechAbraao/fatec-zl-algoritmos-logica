package com.fundamentos
//
class CalculaMediaLista {
    fun calculaMedia(lista: Array<Double>): Double {
        //
        var resultadoSoma: Double = 0.0;
        var mediaFinal: Double = 0.0;
        //
        var i: Int = 0;
        while (i < lista.size) {
            resultadoSoma += lista[i];
            //
            i++
        }
        mediaFinal = (resultadoSoma / lista.size);
        return mediaFinal;
    //
    }
}

fun main() {
    //
    val calcMedia = CalculaMediaLista();
    val listaNumeros: Array<Double> = arrayOf(20.0, 20.0, 20.0);
    val x: Double = calcMedia.calculaMedia(listaNumeros);
    println("Resultado é: $x")
}
