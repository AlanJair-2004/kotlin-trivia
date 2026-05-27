package ui

import data.obtenerPreguntas
import java.awt.BorderLayout
import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.SwingConstants

class TriviaVentana : JFrame("Trivia de Disney") {

    private var indicePregunta = 0
    private var puntaje = 0
    private val preguntas = obtenerPreguntas().shuffled().take(10)

    private val etiquetaPregunta = JLabel("", SwingConstants.CENTER)
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

        mostrarPregunta()
    }

    private fun mostrarPregunta() {
        panelOpciones.removeAll()

        if (indicePregunta >= preguntas.size) {
            etiquetaPregunta.text = "Trivia terminada"
            return
        }

        val preguntaActual = preguntas[indicePregunta]
        etiquetaPregunta.text = "Pregunta ${indicePregunta + 1}: ${preguntaActual.texto}"

        preguntaActual.opciones.forEachIndexed { _, opcion ->
            val boton = JButton(opcion)
            panelOpciones.add(boton)
        }

        panelOpciones.revalidate()
        panelOpciones.repaint()
    }
}