# Minhas Tarefas - API REST com Ktor 🇧🇷 | MyTasks API REST with Ktor 🇺🇸

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-blue.svg)](https://kotlinlang.org)
[![Ktor](https://img.shields.io/badge/Ktor-2.3.3-red.svg)](https://ktor.io)

Projeto desenvolvido durante o curso ["Utilizando Ktor para criar uma CRUD REST API com Kotlin"](https://www.alura.com.br/artigos/utilizando-ktor-criar-crud-rest-api-kotlin) da Alura.  
Project developed during the ["Using Ktor to create a CRUD REST API with Kotlin"](https://www.alura.com.br/artigos/utilizando-ktor-criar-crud-rest-api-kotlin) course from Alura.

---

## Português (BR) 🇧🇷

### 📚 Sobre o Projeto
API RESTful para gerenciamento de tarefas, desenvolvida em Kotlin com Ktor. Implementa operações CRUD básicas com serialização JSON e configuração de rotas.

### ✨ Funcionalidades
- Criação, leitura, atualização e exclusão de tarefas
- Serialização JSON com kotlinx.serialization
- Sistema de roteamento modular
- Content Negotiation para formatos diferentes
- Dockerização da aplicação

### 🛠️ Tecnologias
- Kotlin 1.9.0
- Ktor 2.3.3
- Gradle
- Docker

### ▶️ Executando o Projeto

#### Pré-requisitos
- JDK 17+
- Gradle 8.2+
- Docker (opcional)

#### Comandos Úteis
```bash
# Buildar e executar
./gradlew build && ./gradlew run

# Executar testes
./gradlew test

# Criar JAR com todas as dependências
./gradlew buildFatJar

# Construir imagem Docker
./gradlew buildImage

# Executar com Docker
./gradlew runDocker
```

#### Endpoints

| Método  | Rota             | Descrição                        |
|---------|------------------|----------------------------------|
| GET     | `/tarefas`       | Lista todas as tarefas          |
| GET     | `/tarefas/{id}`  | Obtém uma tarefa pelo ID        |
| POST    | `/tarefas`       | Cria uma nova tarefa            |
| PUT     | `/tarefas/{id}`  | Atualiza uma tarefa existente   |
| DELETE  | `/tarefas/{id}`  | Remove uma tarefa               |

---

## English (US) 🇺🇸

### 📚 About the Project
RESTful API for task management, developed in Kotlin with Ktor. Implements basic CRUD operations with JSON serialization and route configuration.

### ✨ Features
- Create, read, update, and delete tasks
- JSON serialization with kotlinx.serialization
- Modular routing system
- Content Negotiation for different formats
- Dockerized application

### 🛠️ Technologies

- Kotlin 1.9.0
- Ktor 2.3.3
- Gradle
- Docker

### ▶️ Running the Project
### Prerequisites
- JDK 17+
- Gradle 8.2+
- Docker (optional)

#### Useful Commands
```bash
# Build and run
./gradlew build && ./gradlew run

# Run tests
./gradlew test

# Create fat JAR
./gradlew buildFatJar

# Build Docker image
./gradlew buildImage

# Run with Docker
./gradlew runDocker
```
#### Endpoints

| Method  | Route            | Description                     |
|---------|------------------|---------------------------------|
| GET     | `/tarefas`       | Lists all tasks                |
| GET     | `/tarefas/{id}`  | Gets a task by ID              |
| POST    | `/tarefas`       | Creates a new task             |
| PUT     | `/tarefas/{id}`  | Updates an existing task       |
| DELETE  | `/tarefas/{id}`  | Deletes a task                 |

----

If the server starts successfully, you'll see the following output:

```
2024-12-04 14:32:45.584 [main] INFO  Application - Application started in 0.303 seconds.
2024-12-04 14:32:45.682 [main] INFO  Application - Responding at http://0.0.0.0:8080
```
