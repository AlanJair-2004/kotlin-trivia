package ui

import java.awt.BorderLayout
import java.awt.GridLayout
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.SwingConstants

class TriviaVentana : JFrame("Trivia de Disney") {

    private val etiquetaPregunta = JLabel("Trivia de Disney", SwingConstants.CENTER)
    private val etiquetaPuntaje = JLabel("Puntaje: 0", SwingConstants.CENTER)
    private val panelOpciones = JPanel(GridLayout(4, 1, 10, 10))

    init {
        setSize(600, 400)
        defaultCloseOperation = EXIT_ON_CLOSE
        setLocationRelativeTo(null)
        layout = BorderLayout()

        add(etiquetaPregunta, BorderLayout.NORTH)
        add(panelOpciones, BorderLayout.CENTER)
        add(etiquetaPuntaje, BorderLayout.SOUTH)
    }
}