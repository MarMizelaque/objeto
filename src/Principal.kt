class Principal {
    val lanches =listOf(
        Produto(12, 10.00 , "xburger"),
    Produto(2, 12.00, "xsalada")

    )
    val bebidas = listOf(
        Produto(4, 8.00, "refrigerante"),
    Produto(7, 6.00, "suco")

    )


fun main(){
    val principal =Principal()
    principal.iniciar()
}
        println("código - nome - valor")
        for(bebida in bebidas){
            println("${Bebida.codigo} - ${bebida}.nome} - R\$${bebida}.valor}")
        }
    }

}