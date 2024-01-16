package com.alopgal962.room.addtasks.domain

import com.alopgal962.room.addtasks.data.TaskRepository
import com.alopgal962.room.addtasks.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

//en esta carpeta se ponen los casos de uso

/**
 * Caso de uso para recuperar las tareas
 *
 * Para acceder al data vamos a necesitar el repositorio, ya que es nuestra puerta de entrada al data.
 * Gracias a Dagger Hilt lo vamos a inyectar en el constructor.
 */
class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks
}