package com.varefree.coroutineplayground

data class TodoList(
    val count: Int,
    val lastItemIndex: Int,
    val page: Int,
    val results: List<Todo>,
    val totalCount: Int,
    val totalPages: Int
)