fun main() {
    for (nomer in 1..20) {
        if (nomer % 2 == 0)
            continue
        if (nomer > 15) {
            break
        }
        println("Nomernya adalah $nomer")
    }
}