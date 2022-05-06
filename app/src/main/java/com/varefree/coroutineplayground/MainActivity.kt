package com.varefree.coroutineplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.coroutines.*
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException
import kotlin.reflect.typeOf
import kotlin.system.measureTimeMillis
/*
Retrofit and coroutine sample
 */

class MainActivity : AppCompatActivity() {
    val TAG = "MAINX"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        test()
    }

     fun test() {

        GlobalScope.launch {
            val response = async { RetrofitObject.api.getQuotes() }

            val B = response.await()

            if (B.isSuccessful && B.body() != null)
            { var temp = B.body()
                var list = temp?: listOf()

                if(!list.isEmpty())
                {
                    for(t in list)
                    {
                        delay(500L)
                        Log.i(TAG, "Title: " +t.title+" -> "+t.id)
                        Log.i(TAG, "isCompleted: " +t.completed+" -> "+t.completed)

                    }
                }
            }
        }
    }
}