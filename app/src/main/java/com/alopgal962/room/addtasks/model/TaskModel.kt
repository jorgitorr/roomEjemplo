package com.alopgal962.room.addtasks.model

//Nuestro modelo de datos...
//El valor del id por defecto lo vamos a calcular con el momento en el que lo creamos, es decir, el tiempo en milisegundos.
//El valor de la casilla de verificación por defecto debería ser siempre falso cuando creamos la tarea.
//Nuestro modelo de datos...
data class TaskModel(
    //El método hashcode() nos crea un código único a través del número de milisegundos al que aplica...
    //El hascode() es lo que utiliza el compilador para comparar objetos, es decir,
    //lo hace a través del hashcode() que se genera en cada objeto.
    val id: Int = System.currentTimeMillis().hashCode(),
    val task: String,
    var selected: Boolean = false
)
