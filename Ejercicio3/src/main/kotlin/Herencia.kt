open class Transporte(val capacidad: Int) : VehiculoPublico {
    override fun iniciarRuta() {
        println("Vehículo con capacidad de $capacidad pasajeros está listo.")
    }
}