package com.varefree.coroutineplayground

data class Todo(
    var userId: Int,
    var id: Int,
    var title: String,
    var completed: Boolean
)