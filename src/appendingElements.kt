fun main() {
    val peliharaan = mutableListOf("Kucing", "Hamster", "Singa", "Harimau", "Cheetah")

    peliharaan += "Hiu, Tupai"
    println(peliharaan.joinToString())
}