package com.D121201018.task.data

import androidx.lifecycle.LiveData
import com.D121201018.task.data.Task
import com.D121201018.task.data.TaskDao

class TaskRepository(private val taskDao: TaskDao) {

    val readAllData: LiveData<List<Task>> = taskDao.readAllData()

    suspend fun addUser(task: Task){
        taskDao.addUser(task)
    }
}