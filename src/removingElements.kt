fun main() {
    val peliharaan = mutableListOf("Kucing", "Hamster", "Singa", "Harimau", "Cheetah")

    val hapus = peliharaan.remove("Cheetah")
    peliharaan.remove("Cheetah")
    println(hapus)
    println(peliharaan.joinToString())

    println()
    
    peliharaan.removeAt(3)
    println(peliharaan.joinToString())
}