package data

import models.Pregunta

fun obtenerPreguntas(): List<Pregunta> {
    return listOf(
        Pregunta(
            "¿Cómo se llama el león protagonista de El Rey León?",
            listOf("Mufasa", "Simba", "Scar", "Timón"),
            2,
            "Películas"
        ),
        Pregunta(
            "¿Qué princesa pierde una zapatilla de cristal?",
            listOf("Ariel", "Bella", "Cenicienta", "Rapunzel"),
            3,
            "Princesas"
        ),
        Pregunta(
            "¿Cuál es el nombre del muñeco de nieve en Frozen?",
            listOf("Sven", "Olaf", "Kristoff", "Hans"),
            2,
            "Frozen"
        )
    )
}