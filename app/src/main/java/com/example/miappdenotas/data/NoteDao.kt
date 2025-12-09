package com.example.miappdenotas.data

import androidx.room.*
import com.example.miappdenotas.model.Note
import kotlinx.coroutines.flow.Flow


@Dao
interface NoteDao {
    @Query("SELECT * FROM notes ORDER BY timestamp DESC")
    fun getAll(): Flow<List<Note>>


    @Query("SELECT * FROM notes WHERE id = :id LIMIT 1")
    suspend fun getById(id: Long): Note?


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: Note): Long


    @Update
    suspend fun update(note: Note)


    @Delete
    suspend fun delete(note: Note)
}