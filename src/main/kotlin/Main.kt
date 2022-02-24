@file:Suppress("unreachable_code")

import kotlin.Unit.toString

fun main() {

    val cliente: Cliente =
        Cliente("Lionel Messi", 35, "mmessi10@gmail.com", "Barcelona - Camp Nou")
        println(cliente.toString())

    val fornecedor: Fornecedor =
        Fornecedor("Adidas", 10, "nikeislittle@gmail.com", "Onde a nike é pequena")
        println(fornecedor.toString())

    val produto: Produto =
        Produto("Nemesis", 10, 1, "R$ 1500,00", "Até rasgar")
        println(produto.toString())

    val transportadora: Transportadora =
        Transportadora("Adidas ltda", "R$ 50,00", 40, "Barcelona")
        println(transportadora.toString())

    val venda: Venda =
        Venda(87987484, "RB754856T85R86", "R$ 500,00")
        println(venda.toString())

    val vendedor: Vendedor =
        Vendedor("Diego Maradona", 7854, "pelésempreserámaior@fifa.com", "Céu")
        println(vendedor.toString())
}