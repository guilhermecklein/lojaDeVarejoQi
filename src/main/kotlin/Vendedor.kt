class Vendedor {

    var nome : String
    var id : Int
    var contato : String
    var endereco : String

    constructor (
        nome : String,
        id : Int,
        contato : String,
        endereco : String
    )

    {
        this.nome = nome
        this.id = id
        this.contato = contato
        this.endereco = endereco
    }

    override fun toString(): String {
        return "\nVENDEDOR \nNome: ${ this.nome }, \nID: ${ this.id } \nContato: ${ this.contato } \nEndereço: ${ this.endereco }"

    }

}
