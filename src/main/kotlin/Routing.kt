package br.com.joao

import br.com.joao.models.Task
import br.com.joao.repositories.TasksRepository
import io.ktor.http.HttpStatusCode
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.receive
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    val repository = TasksRepository()

    routing {
        get("/tasks") {
            call.respond(repository.tasks)
        }
        post("/tasks"){
            val task = call.receive<Task>()
            repository.save(task)
            call.respond(HttpStatusCode.Created, task)
        }
    }
}
