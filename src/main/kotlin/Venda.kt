class Venda {

    var id : Int
    var codigoDeRastreio : String
    var valor : String

    constructor(

        id : Int,
        codigoDeRastreio : String,
        valor : String

    )

    {
        this.id = id
        this.codigoDeRastreio = codigoDeRastreio
        this.valor = valor

    }

    override fun toString(): String {
        return "\nVENDA: \nID: ${ this.id } \nCodigo de rastreio: ${ this.codigoDeRastreio } \nValor: ${ this.valor }"

    }

}
