package pt.ulusofona.cm.kotlin.challenge

import kotlin.collections.ArrayList

open class Pessoa(nome:String, dataDeNascimento: Date) {
    val nome: String = ""
    val veiculos = ArrayList<String>()
    val dataDeNascimento = Date("dd-mm-yyyy");
    val carta = Carta()
    val posicao = Posicao(8, 9)

    override fun toString(): String {
        return "Pessoa | $nome | $dataDeNascimento | $posicao | ${posicao.x}  | ${posicao.y}"
    }

    fun comprarVeiculo(veiculo: Veiculo){

    }
    fun pesquisarVeiculo(identificador:String): Veiculo {
         var veiculo1 = Veiculo()

        return veiculo1
    }

    fun venderVeiculo(identificador: String, comprador: Pessoa){

    }

    fun moverVeiculoPara(identificador: String, x: Int, y:Int){

    }

    fun temCarta():Boolean{
         return true
     }

    fun tiraCarta(){}

}