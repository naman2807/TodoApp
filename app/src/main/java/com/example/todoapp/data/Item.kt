package com.example.todoapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "item")
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo
    val description: String,
    @ColumnInfo
    val date: String,
    @ColumnInfo
    val time: String
)