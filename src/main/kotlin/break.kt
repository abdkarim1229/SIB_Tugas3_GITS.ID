fun main() {
    var Buah = arrayOf("Semangka", "Anggur", "Rambutan", "Apel", "Mangga", "Alpukat", "Pisang")
    println("Mencari Buah Mangga di Array Buah :")
    for (buah in Buah){
        println(buah)
        if (buah == "Mangga"){
            println("Buah ($buah) Sudah di temukan ")
            break
        }
    }
}