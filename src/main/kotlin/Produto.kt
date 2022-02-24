class Produto {

    var nome: String
    var id: Int
    var quantidade: Int
    var preco: String
    var validade: String

    constructor (

        nome : String,
        id : Int,
        quantidade : Int,
        preco : String,
        validade : String
    )

    {
        this.nome = nome
        this.id = id
        this.quantidade = quantidade
        this.preco = preco
        this.validade = validade
    }

    override fun toString(): String {
        return "\nPRODUTO: \nNome: ${ this.nome }, \nID: ${ this.id } \nQuantidade: ${ this.quantidade} \nPreco: ${ this.preco } \nValidade: ${ this.validade }"
    }

}
