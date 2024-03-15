/* Data Class */
// class user(val nama: String, val Umur: Int) {

//     override fun toString(): String {
//         return "User(nama=$nama, Umur=$Umur)"
//     }
// }

// data class user2(val nama: String, val Umur: Int)

// fun main() {
//     val Satu = user("Sigma", 20)
//     val Dua = user2("Tomo", 20)

//     println(Satu)
//     println(Dua)
// }

// data class DataUser(val nama: String, val Umur: Int)

// fun main() {
//     val dataUser = DataUser("nrohmen", 17)
//     val dataUser2 = DataUser("nrohmen", 17)
//     val dataUser3 = DataUser("dimas", 24)

//     println(dataUser.equals(dataUser2))
//     println(dataUser.equals(dataUser3))
// }

/* Salin Modifikasi Data */
// data class DataUser(val name: String, val age: Int)

// fun main() {
//     val dataUser = DataUser("nrohmen", 17)
//     val dataUser2 = DataUser("nrohmen", 17)
//     val dataUser3 = DataUser("dimas", 24)
//     val dataUser4 = dataUser.copy()

//     println(dataUser4)
// }

/* Destruction Declaration */

// fun main() {
//     val dataUser = DataUser("nrohmen", 17)

//     val name = dataUser.component1()
//     val age = dataUser.component2()

//     println("My name is $name, I am $age years old")
// }

// data class DataUser(val name: String, val age: Int)

// fun main() {
//     val dataUser = DataUser("nrohmen", 17)
//     val (name, age) = dataUser

//     println("My name is $name, I am $age years old")
// }

// data class DataUser(val name: String, val age: Int)
