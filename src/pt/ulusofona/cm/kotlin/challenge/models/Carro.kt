package pt.ulusofona.cm.kotlin.challenge

class Carro(identificador: String, motor: Motor) {
    val identificador: String = ""
    val posicao = Posicao(8, 9)
    val dataDeAquisicao = Date("dd-mm-yyyy")

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | $posicao | ${posicao.x} | ${posicao.y}"
    }
}