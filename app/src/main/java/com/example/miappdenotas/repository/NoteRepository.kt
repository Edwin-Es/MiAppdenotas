package com.example.miappdenotas.repository

import com.example.miappdenotas.data.NoteDao
import com.example.miappdenotas.model.Note
import kotlinx.coroutines.flow.Flow


class NoteRepository(private val dao: NoteDao) {
    fun getAll() : Flow<List<Note>> = dao.getAll()
    suspend fun getById(id: Long) = dao.getById(id)
    suspend fun insert(note: Note) = dao.insert(note)
    suspend fun update(note: Note) = dao.update(note)
    suspend fun delete(note: Note) = dao.delete(note)
}