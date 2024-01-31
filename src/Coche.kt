class Coche(
    private var color: String,
    private val marca: String,
    private val modelo: String,
    private val numCaballos: Int,
    private val numPuertas: Int,
    private val matricula: String
) {
    var colorActual: String = color
        set(value) {
            require(color.isNotBlank()) { "El campo color no puede estar en blanco." }
            field = value
        }

    init {
        require(color.isNotBlank()) { "El campo color no puede estar en blanco." }
        require(marca.isNotBlank()) { "El campo marca no puede estar en blanco." }
        require(modelo.isNotBlank()) { "El campo modelo no puede estar en blanco." }
        require((matricula.length) == 7) { "La matrícula debe tener 7 caracteres." }
        require(numCaballos in 70..700) { "Sólo puede tener entre 70 y 700 caballos de potencia." }
        require(numPuertas in 3..5) { "Sólo pueden tener un mínimo de 3 puertas y un máximo de 5" }
    }

    override fun toString(): String {
        return "Coche(color='$color', marca='$marca', modelo='$modelo', numCaballos=$numCaballos, numPuertas=$numPuertas, matricula='$matricula')"
    }
}