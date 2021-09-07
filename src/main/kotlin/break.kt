fun main() {
    //membuat variabel array "Buah"
    var Buah = arrayOf("Semangka", "Anggur", "Rambutan", "Apel", "Mangga", "Alpukat", "Pisang")
    println("Mencari Buah Mangga di Array Buah :")
    //menerapkan perulangan "for loop" untuk menampilkan array buah
    for (buah in Buah) {
        println(buah)
        /*menggunakan "if" untuk mencari buah Mangga dan menggunakan
        "break statement" jika buah mangga sudah di temukan maka pencarian akan selesai*/
        if (buah == "Mangga") {
            println("Buah ($buah) Sudah di temukan ")
            break
        }
    }
}