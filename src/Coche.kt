class Coche(color: String, marca: String, modelo: String, numCaballos: Int, numPuertas: Int, matricula: String) {

    //GETTER - SETTER - PROPIEDADES DE CLASE:
    var color: String = ""
        get() = field
        set(value) {
            field = value
        }

    val marca: String
        get() = marca

    val modelo: String
        get() = modelo

    val numCaballos: Int
        get() = numCaballos

    val numPuertas: Int
        get() = numPuertas

    val matricula: String
        get() = matricula
    init {
        require(marca.isNullOrBlank()) {"Este campo no puede estar en blanco."}
        require(modelo.isNullOrBlank()) {"Este campo no puede estar en blanco."}
        require(color.isBlank()) {"Este campo no puede estar en blanco."}
    }
}