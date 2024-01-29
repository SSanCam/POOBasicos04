import java.util.*

class Coche(color: String, marca:, modelo: String, numCaballos: Int, numPuertas: Int, matricula: String) {

    //GETTER - SETTER - PROPIEDADES DE CLASE:
    var color: String = ""
        get() = field
        set(value) {
            field = value
        }
    val marca: String
        get() = marca.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

    init {
        require(marca.isNullOrBlank()) {"Este campo no puede estar en blanco."}
        require(modelo.isNullOrBlank()) {"Este campo no puede estar en blanco."}
        require(color.isBlank()) {"Este campo no puede estar en blanco."}
        require((matricula.length) == 7) {"La matrícula debe tener 7 caracteres."}
    }

}