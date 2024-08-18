package com.wilsonferro.lab

import kotlin.math.pow

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val valorEmprestado = 6000.00
    val meses = 10
    val taxa = 1.0

    println("Valor emprestado: R$ $valorEmprestado")
    println("Meses para pagar: $meses")
    println("Taxa fixa mensal: $taxa%")

    val taxaDividida = taxa / 100
    val taxaPotencializada = (1 + taxaDividida).pow(meses)
    val valorParcela = valorEmprestado * (taxaPotencializada * taxaDividida) / (taxaPotencializada - 1)

    val total = valorParcela * meses
    val juros = total - valorEmprestado

    println("-------")
    println("Parcela fixa mensal: R$ $valorParcela")
    println("-------")
    println("Juros: R$ $juros")
    println("Total: R$ $total")
}