// Class And Object

// class box {
//     var panjang: Int = 10
//     val tinggi: Int = 10
//     val lebar: Int = 10

//     fun konten() {
//         print("Boxnya Ketutup")
//     }

//     fun open() {
//         print("Box Kebuka")
//     }
// }

// fun main() {
//     val kotak1 = box()
//     val kotak2 = box()
//     val kotak3 = box()

//     kotak1.panjang = 5
//     println("Panjang ${kotak1.panjang}")
//     println("Lebar ${kotak2.lebar}")
//     println("Tinggi ${kotak3.tinggi}")

//     kotak1.konten()
//     kotak2.open()
// }

// Class And Object

// Setter And Getter

class box {
    var panjang: Int = 10
    val tinggi: Int = 10
    val lebar: Int = 10

    val volume
        get() = panjang * lebar * tinggi

    var namabox: String = "Nama Box"
        set(value) {
            if (value.length < 3) {
                println("Nama Kurang dari 3 karakter")
            } else {
                field = value
            }
        }

    fun konten() {
        print("Boxnya Ketutup")
    }

    fun open() {
        print("Box Kebuka")
    }
}

fun main() {
    val kotak1 = box()
    val kotak2 = box()
    val kotak3 = box()

    kotak1.panjang = 5
    println("Panjang ${kotak1.panjang}")
    println("Lebar ${kotak2.lebar}")
    println("Tinggi ${kotak3.tinggi}")
    println("Tinggi ${kotak3.volume}")

    kotak1.namabox = "1"
    println("Nama Box ${kotak1.namabox}")

    kotak1.konten()
    kotak2.open()
}

// Setter And Getter
