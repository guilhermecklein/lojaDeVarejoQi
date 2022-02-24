class Transportadora {

    var nome : String
    var valorEntrega : String
    var id : Int
    var endereco : String

    constructor(

        nome : String,
        valorEntrega : String,
        id : Int,
        endereco : String
    )

    {
        this.nome = nome
        this.valorEntrega = valorEntrega
        this.id = id
        this.endereco = endereco
    }

    override fun toString(): String {
        return "\nTRANSPORTADORA: \nNome: ${ this.nome }, \nValor da Entrega: ${ this.valorEntrega } \nID: ${ this.id } \nEndereço: ${ this.endereco }"

    }

}
