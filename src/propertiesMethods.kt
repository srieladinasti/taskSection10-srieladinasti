fun main() {
    val peliharaan = mutableListOf("Kucing", "Hamster", "Singa", "Harimau", "Cheetah")
        if (peliharaan.isEmpty()){
            println("Maaf, list binatang peliharaan kosong")
        }
        else{
            println("list binatang peliharaan ada, silahkan lanjutkan")
        }

        if (peliharaan.size > 5){
            println("Lanjutkan")
        }
        else{
            println("Tidak bisa melanjutkan")
        }
}