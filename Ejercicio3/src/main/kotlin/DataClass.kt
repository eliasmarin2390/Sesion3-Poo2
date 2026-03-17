data class Bus(
    val numeroRuta: String,
    val cap: Int,
    val conductor: String
) : Transporte(cap) {

    override fun iniciarRuta() {
        println("--- Reporte de Salida ---")
        println("Bus Ruta: $numeroRuta")
        println("Conductor asignado: $conductor")
        super.iniciarRuta() // Ejecuta la lógica de capacidad de la clase padre
        println("Estado: EN MARCHA\n")
    }
}