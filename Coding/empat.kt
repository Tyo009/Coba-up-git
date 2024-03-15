// }

// fun main() {
//     val Fullname = getFullname(middle = "is", first = "halo")
//     print(Fullname)
// }

// fun getFullname(middle: String, first: String): String {
//     return ("$middle $first")
// }

// fun getFullname(first: String = "halo", Second: String = "Saya", Third: String = "Sigma"): String
// {
//     return ("$first, $Second, $Third ")
// }

// fun main() {
//     val Fullname = getFullname()
//     print(Fullname)
// }

// fun jam(vararg jam: Int): Int {
//     return jam.sum()
// }

// fun main() {
//     val number = jam(1, 2, 3)
//     print(number)
// }

// fun <T> asList(vararg input: T): List<T> {
//     val result = ArrayList<T>()
//     for (item in input) result.add(item)
//     return result
// }

// class Nomor : Int() {
//     fun printInt() {
//         println(" Value $this")
//     }
// }

// fun Int.printInt() {
//     print("value $this")
// }

// fun main() {
//     10.printInt()
// }

// typealias Arithmetic = ((Int, Int) -> Int)?

// fun main() {
//     val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

//     val sumResult = sum?.invoke(10, 10)

//     println(sumResult)
// }

// fun main() {
//     message()
// }

// val message = { println("Hello From ") }

// fun main() {
//     val text = "hallo"
//     val hasil =
//             text.run {
//                 val from = this
//                 val to = this.replace("hallo", "Kotlin")
//                 "replace hasil dari $from to $to"
//             }
//     println("hasil : $hasil")
// }

// fun main() {
//     val message: String? = null
//     message?.let {
//         val length = it.length * 2
//         val text = "text length $length"
//         println(text)
//     }
// }

fun main() {
    val numbers = listOf(1, 2, 3)
    val fold =
            numbers.fold(10) { current, item ->
                println("current $current")
                println("item $item")
                println()
                current + item
            }

    println("Fold result: $fold")
}
