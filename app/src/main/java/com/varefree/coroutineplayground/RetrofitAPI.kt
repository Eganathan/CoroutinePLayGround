package com.varefree.coroutineplayground

import android.app.DownloadManager
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitAPI {

        @GET("/todos")
        suspend fun getQuotes() : Response<List<Todo>>
    }