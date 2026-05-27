package models

data class Pregunta(
    val texto: String,
    val opciones: List<String>,
    val respuestaCorrecta: Int,
    val categoria: String
)