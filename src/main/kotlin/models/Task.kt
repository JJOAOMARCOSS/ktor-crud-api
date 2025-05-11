package br.com.joao.models

import kotlinx.serialization.Serializable


@Serializable
data class Task(
    val title: String,
    val description: String
)