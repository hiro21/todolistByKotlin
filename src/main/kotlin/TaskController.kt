package todolist

import com.fasterxml.jackson.databind.ObjectMapper
import spark.Route
import spark.Spark.halt
import java.lang.Exception

class TaskController(private val objectMapper: ObjectMapper,
                     private val taskRepository: TaskRepository) {
    fun index() : Route = Route { request, response ->
        taskRepository.findAll()
    }

    fun create(): Route = Route { req, res ->
        val request: TaskCreateRequest =
            objectMapper.readValue(req.bodyAsBytes()) ?:throw halt(400)
        val task = taskRepository.create(request.content)
        res.status(201)
        task
    }

}