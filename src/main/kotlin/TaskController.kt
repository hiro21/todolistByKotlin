package todolist

import spark.Request
import spark.Response
import spark.Route

class TaskController {
    fun index() : Route = object : Route {
        override fun handle(request: Request?, response: Response?): Any =
                listOf(
                        Task(1, "test1", false),
                        Task(2, "test2", false)
                )
    }

}