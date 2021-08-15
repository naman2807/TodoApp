package com.example.todoapp.dao

import androidx.room.*
import com.example.todoapp.data.Item
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item)

    @Update
    suspend fun update(item: Item)

    @Delete
    suspend fun delete(item: Item)

    @Query("SELECT * FROM item ORDER BY description ASC")
    fun getTodoItems(): Flow<List<Item>>
}