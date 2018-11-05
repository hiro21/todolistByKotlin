package todolist

import spark.Request
import spark.Response
import spark.Route

class TaskController {
    fun index() : Route = Route { request, response ->
        listOf(
                Task(1, "test1", false),
                Task(2, "test2", true)
        )

    }

}