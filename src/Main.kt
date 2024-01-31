fun main() {
    try {
        val coche1 = Coche("Rojo", "toyota", "corolla", 150, 4, "ABC1234")
        val coche2 = Coche("Azul", "honda", "civic", 120, 4, "DEF5678")
        val coche3 = Coche("Negro", "ford", "focus", 100, 5, "GHI9012")
        val coche4 = Coche("Blanco", "chevrolet", "malibu", 200, 4, "JKL3456")
        val coche5 = Coche("Plateado", "nissan", "sentra", 80, 3, "MNO7890")

        val concesionario = listOf(coche1, coche2, coche3, coche4, coche5)
        //Imprimimos todos los coches que hemos creado previamente.
        for (coche in concesionario) {
            println(coche)
        }

        //Instanciamos otra tanda de coches con valores que serán erróneos.
        val coche6 = Coche("Rojo", "", "", 150, 4, "ABC1234")
        val coche7 = Coche("Azul", "honda", "civic", 1000, 4, "DEF5678")
        val coche8 = Coche("Negro", "ford", "focus", 100, 10, "GHI9012")
        val coche9 = Coche("Blanco", "chevrolet", "malibu", 200, 4, "JKL3456JKL3456")
        val coche10 = Coche("", "", "", 50, 0, "")

        //Imprimimos todos los coches con errores que hemos instanciado previamente.
        val concesionario2 = listOf(coche6, coche7, coche8, coche9, coche10)
        for (coche in concesionario2) {
                println(coche)
        }
    }catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }

}


