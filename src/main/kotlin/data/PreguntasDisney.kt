package data

import models.Pregunta

fun obtenerPreguntas(): List<Pregunta> {
    return listOf(
        Pregunta("¿Cómo se llama el león protagonista de El Rey León?", listOf("Mufasa", "Simba", "Scar", "Timón"), 2, "Películas"),
        Pregunta("¿Qué princesa pierde una zapatilla de cristal?", listOf("Ariel", "Bella", "Cenicienta", "Rapunzel"), 3, "Princesas"),
        Pregunta("¿Cuál es el nombre del muñeco de nieve en Frozen?", listOf("Sven", "Olaf", "Kristoff", "Hans"), 2, "Frozen"),
        Pregunta("¿Qué animal es Dumbo?", listOf("Elefante", "León", "Conejo", "Oso"), 1, "Clásicos"),
        Pregunta("¿Cómo se llama la sirenita de Disney?", listOf("Aurora", "Mulan", "Ariel", "Elsa"), 3, "Princesas"),
        Pregunta("¿Quién es el villano principal en La Bella Durmiente?", listOf("Úrsula", "Maléfica", "Cruella", "Madre Gothel"), 2, "Villanos"),
        Pregunta("¿Cómo se llama el vaquero protagonista de Toy Story?", listOf("Buzz", "Woody", "Andy", "Rex"), 2, "Pixar"),
        Pregunta("¿Cómo se llama la hermana de Elsa en Frozen?", listOf("Ariel", "Anna", "Bella", "Mérida"), 2, "Frozen"),
        Pregunta("¿Qué personaje dice Hakuna Matata?", listOf("Timón y Pumba", "Elsa y Anna", "Mickey y Minnie", "Woody y Buzz"), 1, "Frases"),
        Pregunta("¿Qué película tiene la canción Libre Soy?", listOf("Moana", "Frozen", "Valiente", "Tarzán"), 2, "Canciones"),
        Pregunta("¿Cómo se llama el pez amigo de Nemo?", listOf("Dory", "Marlin", "Gill", "Bruce"), 1, "Pixar"),
        Pregunta("¿Cómo se llama el papá de Nemo?", listOf("Marlin", "Crush", "Nigel", "Bloat"), 1, "Pixar"),
        Pregunta("¿Qué personaje de Toy Story es un astronauta?", listOf("Woody", "Buzz Lightyear", "Slinky", "Rex"), 2, "Pixar"),
        Pregunta("¿Cómo se llama el dragón de Mulán?", listOf("Mushu", "Sisu", "Kaa", "Pascal"), 1, "Clásicos"),
        Pregunta("¿Qué princesa se hace pasar por soldado?", listOf("Mulán", "Ariel", "Elsa", "Jazmín"), 1, "Princesas")
    )
}

fun obtenerCategorias(): List<String> {
    return obtenerPreguntas()
        .map { it.categoria }
        .distinct()
}

fun obtenerPreguntasDePixar(): List<Pregunta> {
    return obtenerPreguntas()
        .filter { it.categoria == "Pixar" }
}

fun existeCategoria(nombreCategoria: String): Boolean {
    return obtenerPreguntas()
        .any { it.categoria == nombreCategoria }
}