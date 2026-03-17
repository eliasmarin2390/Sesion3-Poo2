data class Estudiante(
    val nom: String,
    val carnet: String,
    val carrera: String,
    val año: Int
) : Persona(nom) {

    override fun mostrarDatos() {
        println("--- Datos Estudiante ---")
        super.mostrarDatos() // Llama al nombre en Persona
        println("Carnet: $carnet")
        println("Carrera: $carrera")
        println("Año: $año")
        println("-----------------------")
    }
}