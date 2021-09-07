fun main() {
    //menerapkan perulangan for untuk menampilkan angka 1 sampai 20
    for (nomer in 1..20) {
        //menggunakan if, modulus 2 dan continue statament
        if (nomer % 2 == 0)
            continue
        //menggunakan if, dan break > 15 untuk menampilkan output sampai 15 saja
        if (nomer > 15) {
            break
        }
        println("Nomernya adalah $nomer")
    }
}