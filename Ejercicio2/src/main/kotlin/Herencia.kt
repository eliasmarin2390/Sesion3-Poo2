open class Existencia(val cantidad: Int) : ArticuloVenta {
    override fun mostrarInfo() {
        print("Stock: $cantidad unidades | ")
    }
}