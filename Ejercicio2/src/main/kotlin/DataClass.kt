data class Producto(
    val nombre: String,
    val precio: Double,
    val cant: Int
) : Existencia(cant) {

    override fun mostrarInfo() {
        print("Producto: ${nombre.padEnd(10)} | Precio: C$ ${precio.toString().padEnd(5)} | ")
        super.mostrarInfo()
        println()
    }
}