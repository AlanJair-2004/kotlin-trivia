import javax.swing.SwingUtilities
import ui.TriviaVentana

fun main() {
    SwingUtilities.invokeLater {
        val ventana = TriviaVentana()
        ventana.isVisible = true
    }
}