package com.example.androidcompetition

data class CodeResponse(
    val code: Int,
    val descr: String
)
data class ModelBody(
    val body_list: List<ModelItem>,
    val code: CodeResponse
)
data class ModelItem(
    val tag: Tag,
    val book: List<Book>
)
data class Tag(
    val id: Int,
    val name: String
)
data class Book(
    val id: Int,
    val title: String,
    val cover: String,
    val tags: List<String>
)
