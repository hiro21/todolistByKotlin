package todolist

import spark.Route

class TaskController(private val taskRepository: TaskRepository) {
    fun index() : Route = Route { request, response ->
        taskRepository.findAll()
    }

}