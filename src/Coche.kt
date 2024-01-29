import java.util.*

class Coche(color: String, marca: String, val modelo: String, numCaballos: Int, numPuertas: Int, val matricula: String) {

    //GETTER - SETTER - PROPIEDADES DE CLASE:
    var color: String = ""
        get() = field
        set(value) {
            field = value
        }
    val marca: String
        get() = marca.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

    init {
        require(marca.isBlank()) {"Este campo no puede estar en blanco."}
        require(modelo.isBlank()) {"Este campo no puede estar en blanco."}
        require(color.isBlank()) {"Este campo no puede estar en blanco."}
        require((matricula.length) == 7) {"La matrícula debe tener 7 caracteres."}
        require(numCaballos in 70..700) {"Sólo puede tener entre 70 y 700 caballos de potencia."}
        require(numPuertas in 3..5) {"Sólo pueden tener un mínimo de 3 puertas y un máximo de 5"}
    }

}