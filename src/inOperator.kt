fun main() {
    val peliharaan = arrayOf("Kucing", "Hamster", "Singa", "Harimau", "Cheetah")

    println(ada("Kucing", peliharaan))
    println(tidakAda("Singa", peliharaan))
}

fun ada(hewan: String, array: Array<String>) : Boolean{
    return hewan in array
}

fun tidakAda(hewan: String, array: Array<String>) : Boolean{
    return hewan !in array
}