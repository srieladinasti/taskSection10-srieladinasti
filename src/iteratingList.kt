fun main() {
    val peliharaan = mutableListOf("Kucing", "Hamster", "Singa", "Harimau", "Hiu")

    for ((index, hewan) in peliharaan.withIndex()){
        println("${index + 1} - $hewan")
    }
}