package todolist

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import spark.Spark.get

fun main (args : Array<String>) {
    val objectMapper = ObjectMapper().registerKotlinModule()
    get("/tasks",  { req, res ->
        val tasks = listOf(
                Task(1, "test1", false),
                Task(2, "test2", true)
        )
        objectMapper.writeValueAsString(tasks)

    }, objectMapper::writeValueAsString)
}