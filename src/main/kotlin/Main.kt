import data.existeCategoria
import data.obtenerCategorias
import javax.swing.SwingUtilities
import ui.TriviaVentana

fun main() {
    SwingUtilities.invokeLater {
        mostrarInformacionInicial()

        val ventana = TriviaVentana()
        ventana.isVisible = true
    }
}

fun mostrarInformacionInicial() {
    val categorias = obtenerCategorias()

    println("Categorias disponibles:")
    categorias.forEach { categoria ->
        println("- $categoria")
    }

    println("¿Existe categoria Pixar?: ${existeCategoria("Pixar")}")
}