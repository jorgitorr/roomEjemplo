package com.alopgal962.room.addtasks.domain

import com.alopgal962.room.addtasks.data.TaskEntity
import com.alopgal962.room.addtasks.data.TaskRepository
import com.alopgal962.room.addtasks.ui.model.TaskModel
import javax.inject.Inject

class DeleteTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.delete(taskModel)
    }
}