package ru.allaber.domain.model

data class Question(
    val id: Int,
    val imageName: String,
    val points: Int,
    val answers: List<Answer>
)
