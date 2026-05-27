Trivia de Disney en Kotlin

Descripción breve

Este proyecto es una aplicación de consola desarrollada en Kotlin donde el usuario responde una trivia de preguntas relacionadas con películas y personajes de Disney. El programa valida las respuestas, calcula el puntaje obtenido y muestra el resultado final del jugador.

Instrucciones de instalación y ejecución

Requisitos

Antes de ejecutar el proyecto es necesario tener instalado:

- Java JDK
- Kotlin Compiler

Pasos para ejecutar el proyecto

1. Clonar el repositorio dentro de la carpeta donde lo quieres anortar y ya estando dentro de la terminal de la carpeta anortar el sigueinte comando 

git clone git@github.com:AlanJair-2004/kotlin-trivia.git

2. Entrar a la carpeta del proyecto

cd kotlin-trivia-disney

3. Compilar el archivo Kotlin

kotlinc Main.kt -include-runtime -d trivia.jar

4. Ejecutar la aplicación

java -jar trivia.jar


Funcionalidades principales

- Menú interactivo en consola.
- Preguntas de trivia sobre Disney.
- Opciones múltiples de respuesta.
- Validación automática de respuestas.
- Sistema de puntaje.
- Resultado final según respuestas correctas.
- Manejo de entradas inválidas.
- Registro y visualización del puntaje del jugador.


Conceptos de Kotlin aplicados


Funciones: Uso de funciones como mostrarMenu(), iniciarTrivia() y mostrarResultado() 
Condicionales: Uso de if y when para validar respuestas y opciones 
Ciclos: Uso de while y for para recorrer preguntas y mantener activo el menú 
Colecciones: Uso de List y mutableListOf para almacenar preguntas y puntajes 
Operaciones funcionales: Uso de forEach, filter, count y map 
Null Safety: Uso de ?., ?: y toIntOrNull(), para evitar errores por valores nulos 
Data Class: Uso de data class Pregunta para modelar las preguntas 
Organización del código: Separación de lógica mediante funciones independientes 


Reflexión de proceso

a) ¿Qué fue lo más difícil de este proyecto y cómo lo resolviste?

Lo más difícil de este proyecto fue organizar correctamente la lógica de las preguntas y respuestas para que el programa funcionara de manera ordenada. Al principio tenía problemas porque todas las instrucciones estaban juntas y era complicado identificar errores. Para solucionarlo dividímos el programa en varias funciones, separando el menú, las preguntas y el cálculo del puntaje. Esto ayudó a que el código fuera más limpio, más fácil de entender y más sencillo de modificar.

b) ¿Hubo algún concepto de Kotlin que al principio no entendías y que ahora sí comprendes? ¿Cómo llegaste a entenderlo?

Uno de los conceptos que nos costó comprender fue el manejo de null safety. Al inicio no entendíamos bien por qué Kotlin utilizaba operadores como `?.` y `?:`, pero mientras desarrollabamos el proyecto entendímos que sirven para evitar errores cuando el usuario ingresa datos incorrectos o vacíos. Practicando con `readLine()?.toIntOrNull()` pudimos comprender mejor cómo validar entradas de manera segura sin que el programa se cerrara inesperadamente.

c) Si tuvieras que mejorar o ampliar este proyecto, ¿qué le agregarías y por qué?

Si tuvieramos que ampliar este proyecto, nos gustaría agregar diferentes niveles de dificultad, categorías específicas de películas y un sistema para guardar puntajes en archivos. También sería interesante incluir temporizadores para responder cada pregunta y agregar más preguntas aleatorias para que la trivia cambie cada vez que se juegue. Esto haría que el juego fuera más dinámico, entretenido y completo.

d) ¿Qué aprendiste de este proyecto que no aprendiste solo leyendo o viendo videos?

Aprendímos que desarrollar un proyecto completo ayuda mucho más a comprender la programación que solamente leer teoría o ver ejemplos pequeños. Durante este proyecto entendímos mejor cómo conectar diferentes conceptos como funciones, ciclos, colecciones y validaciones dentro de una sola aplicación funcional. También aprendímos la importancia de organizar el código correctamente y probar constantemente el programa para detectar errores y mejorar su funcionamiento.
