import java.util.Scanner

class Restoran {
    private val menu = mutableMapOf<String, Int>()

    init {
        // Menambahkan menu contoh
        menu["Nasi Goreng"] = 15000
        menu["Mie Goreng"] = 12000
        menu["Ayam Bakar"] = 25000
        menu["Sop Buntut"] = 35000
    }

    fun lihatMenu() {
        if (menu.isNotEmpty()) {
            println("Menu Restoran:")
            var nomorMenu = 1
            for ((nama, harga) in menu) {
                println("$nomorMenu. $nama: Rp $harga")
                nomorMenu++
            }
        } else {
            println("Restoran belum memiliki menu.")
        }
    }

    fun beliMenu(nomorMenu: Int, jumlah: Int): Int? {
        val menuKeys = menu.keys.toList()
        if (nomorMenu in 1..menuKeys.size) {
            val menuKey = menuKeys[nomorMenu - 1]
            val harga = menu[menuKey] ?: return null
            return harga * jumlah
        } else {
            println("Menu dengan nomor tersebut tidak ada.")
            return null
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val restoran = Restoran()

    while (true) {
        println("\nPilih Operasi:")
        println("1. Lihat Menu")
        println("2. Beli Menu")
        println("3. Keluar")

        print("Masukkan nomor pilihan Anda: ")
        val input = scanner.nextLine()

        try {
            val pilihan = input.toInt()
            when (pilihan) {
                1 -> restoran.lihatMenu()
                2 -> {
                    restoran.lihatMenu()
                    print("Masukkan nomor menu yang ingin dibeli: ")
                    val nomorMenu = scanner.nextInt()
                    scanner.nextLine() // Membersihkan newline character
                    print("Masukkan jumlah yang ingin dibeli: ")
                    val jumlah = scanner.nextInt()
                    scanner.nextLine() // Membersihkan newline character
                    val total = restoran.beliMenu(nomorMenu, jumlah)
                    if (total != null) {
                        println("Total harga: Rp $total")
                    }
                }
                3 -> {
                    println("Terima kasih! Sampai jumpa.")
                    return
                }
                else -> println("Pilihan tidak valid. Silakan pilih lagi.")
            }
        } catch (e: NumberFormatException) {
            println("Input tidak valid. Masukkan nomor.")
        }
    }
}
