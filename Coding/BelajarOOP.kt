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


// class Lamp {

//     // property (data member)
//     private var isOn: Boolean = false

//     // member function
//     fun turnOn() {
//         isOn = true
//     }

//     // member function
//     fun turnOff() {
//         isOn = false
//     }

//     fun displayLightStatus(lamp: String) {
//         if (isOn == true) println("$lamp lamp is on.") else println("$lamp lamp is off.")
//     }
// }

// fun main() {

//     val l1 = Lamp() // create l1 object of Lamp class
//     val l2 = Lamp() // create l2 object of Lamp class

//     l1.turnOn()
//     l2.turnOff()

//     l1.displayLightStatus("l1")
//     l2.displayLightStatus("l2")
// }
