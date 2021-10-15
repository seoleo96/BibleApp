package com.example.bibleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.bibleapp.core.BibleApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val service = (application as BibleApp).service
        CoroutineScope(Dispatchers.IO).launch {
            val list = service.fetchBook()

            list.forEach{
                Log.d("MainActivity", it.toString())
            }
        }
    }
}