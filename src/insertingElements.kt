fun main() {
    val peliharaan = mutableListOf("Kucing", "Hamster", "Singa", "Harimau", "Cheetah")

    peliharaan.add(2, "Hiu")
    println(peliharaan.joinToString())
}