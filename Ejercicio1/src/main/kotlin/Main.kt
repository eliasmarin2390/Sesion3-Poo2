fun main() {
    // Crear al menos 3 objetos Estudiante
    val estudiante1 = Estudiante("Ana García", "2024-001", "Ingeniería en Sistemas", 1)
    val estudiante2 = Estudiante("Carlos López", "2022-045", "Ingeniería en Sistemas", 3)
    val estudiante3 = Estudiante("Lucía Torres", "2020-089", "Ingeniería en Sistemas", 5)

    // Mostrar sus datos
    estudiante1.mostrarDatos()
    estudiante2.mostrarDatos()
    estudiante3.mostrarDatos()
}