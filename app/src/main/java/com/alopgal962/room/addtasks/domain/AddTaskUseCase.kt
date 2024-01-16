package com.alopgal962.room.addtasks.domain

import com.alopgal962.room.addtasks.data.TaskRepository
import com.alopgal962.room.addtasks.model.TaskModel
import javax.inject.Inject

/**
 * Caso de uso para añadir una tarea
 */

class AddTaskUseCase @Inject constructor(private val taskRepository: TaskRepository){
    suspend operator fun invoke(taskModel: TaskModel){
        taskRepository.add(taskModel)
    }
}