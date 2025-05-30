package br.com.joao.repositories

import br.com.joao.models.Task

class TasksRepository {

    val tasks get() = _tasks.toList()

    fun save(task: Task){
        _tasks.add(task)
    }

    companion object {
        private val _tasks = mutableListOf<Task>()
    }


}