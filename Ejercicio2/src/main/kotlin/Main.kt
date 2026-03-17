fun main() {

    val p1 = Producto("Arroz", 22.0, 50)
    val p2 = Producto("Frijoles", 34.5, 40)
    val p3 = Producto("Azúcar", 15.0, 30)
    val p4 = Producto("Aceite", 65.0, 15)
    val p5 = Producto("Jabón", 28.0, 20)

    println(" INVENTARIO PULPERÍA MASAYA ")
    p1.mostrarInfo()
    p2.mostrarInfo()
    p3.mostrarInfo()
    p4.mostrarInfo()
    p5.mostrarInfo()
}