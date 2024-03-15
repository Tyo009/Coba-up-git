/* Konsep Functional Programming */

fun coba(awal: String, tengah: String, akhir: String): String {
    return "$awal $tengah $akhir"
}

fun main() {
    val nama = coba(awal = "Sigma", tengah = "Guntur", akhir = "Prasetyo")
    println(nama)
}
