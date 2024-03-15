class Product(val id: Int, val name: String, val price: Double)

class Customer(val id: Int, val name: String)

class ShoppingCart {
    val items = mutableListOf<Product>()

    fun addItem(product: Product) = items.add(product)

    fun calculateTotal() = items.sumOf { it.price }
}

class Store(val name: String, val products: List<Product>) {
    fun displayProducts() {
        println("Available products:")
        products.forEach { println("${it.id}. ${it.name} - $${it.price}") }
    }

    fun sellProduct(customer: Customer, productId: Int, quantity: Int) {
        val product = products.find { it.id == productId }

        if (product != null) {
            val totalCost = product.price * quantity
            println(
                    "Customer ${customer.name} has purchased $quantity ${product.name}(s) for $$totalCost."
            )
        } else {
            println("Product with ID $productId not found.")
        }
    }
}

fun main() {
    // Meminta input untuk produk
    val products = mutableListOf<Product>()
    println("Enter product details:")
    for (i in 1..3) {
        print("Product $i ID: ")
        val productId = readLine()!!.toInt()

        print("Product $i Name: ")
        val productName = readLine()!!

        print("Product $i Price: $")
        val productPrice = readLine()!!.toDouble()

        products.add(Product(productId, productName, productPrice))
    }

    // Meminta input untuk pelanggan
    print("Enter customer ID: ")
    val customerId = readLine()!!.toInt()

    print("Enter customer Name: ")
    val customerName = readLine()!!

    val customer = Customer(customerId, customerName)

    // Inisialisasi toko dengan produk
    val store = Store("My Store", products)

    // Menampilkan produk yang tersedia di toko
    store.displayProducts()

    // Pelanggan menambahkan produk ke keranjang belanja
    val shoppingCart = ShoppingCart()
    println("Enter product ID to add to the shopping cart (enter 0 to finish):")
    var productId: Int
    do {
        print("Product ID: ")
        productId = readLine()!!.toInt()

        if (productId != 0) {
            val product = products.find { it.id == productId }
            if (product != null) {
                shoppingCart.addItem(product)
            } else {
                println("Product with ID $productId not found.")
            }
        }
    } while (productId != 0)

    // Menampilkan total belanja
    println("Total shopping cart cost: $${shoppingCart.calculateTotal()}")

    // Pelanggan melakukan pembelian
    println("Enter product ID to purchase:")
    val purchaseProductId = readLine()!!.toInt()
    print("Enter quantity: ")
    val purchaseQuantity = readLine()!!.toInt()

    store.sellProduct(customer, purchaseProductId, purchaseQuantity)
}
