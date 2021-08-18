fun main() {
    val peliharaan = mutableListOf("Kucing", "Hamster", "Singa", "Harimau", "Cheetah")

    peliharaan.set(4, "Hiu")
    println(peliharaan.joinToString())

    peliharaan[3] = "Tupai"
    println(peliharaan.joinToString())

    peliharaan.sort()
    println(peliharaan.joinToString())
}