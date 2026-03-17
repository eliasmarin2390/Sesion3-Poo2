open class Persona(val nombre: String) : Informacion {
    override fun mostrarDatos() {
        println("Nombre: $nombre")
    }
}