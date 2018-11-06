package todolist

class TaskRepository {
    private val tasks: MutableList<Task> = mutableListOf()
    private val maxId: Long get() = tasks.map(Task::id).max() ?: 0

    fun findAll(): List<Task> = tasks.toList()
    fun create(content: String): Task {
        val id = maxId + 1
        val task = Task(id, content, false)
        tasks += task
        return task
    }

}