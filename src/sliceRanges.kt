fun main() {
    val peliharaan = listOf("Kucing", "Hamster", "Singa", "Harimau", "Cheetah")
    println(peliharaan.joinToString())

    val tigaPeliharaan = peliharaan.slice(0..3)
    println(tigaPeliharaan.joinToString())
}