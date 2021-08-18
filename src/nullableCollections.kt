fun main() {
    var peliharaan: List<String>? = mutableListOf("Kucing", "Hamster", "Singa", "Harimau", "Hiu")
    println(peliharaan)
    peliharaan = null
    println(peliharaan)

    println()

    var peliharaan2: List<String?> = mutableListOf("Kucing", "Hamster", "Singa", null, "Hiu")
    println(peliharaan2)
    println(peliharaan2!! [3])

    println()

    var angka: List<Int?> = mutableListOf(1, 2, 3, null, 5)
    println(angka)
    println(angka!! [3])

}