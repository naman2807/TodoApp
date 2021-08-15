package com.example.todoapp

import android.app.Application
import com.example.todoapp.database.ItemDatabase

class TodoApplication: Application() {
    val database : ItemDatabase by lazy {
        ItemDatabase.getDatabase(this)
    }
}