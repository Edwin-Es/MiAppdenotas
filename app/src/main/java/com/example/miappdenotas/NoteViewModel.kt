package com.example.miappdenotas

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.miappdenotas.data.NoteDatabase
import com.example.miappdenotas.model.Note
import com.example.miappdenotas.repository.NoteRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch


class NoteViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = NoteDatabase.getDatabase(application).noteDao()
    private val repo = NoteRepository(dao)


    val notes: StateFlow<List<Note>> = repo.getAll()
        .map { it }
        .stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())


    suspend fun getNoteById(id: Long): Note? = repo.getById(id)


    fun insertNote(title: String, content: String) {
        viewModelScope.launch {
            val note = Note(title = title, content = content)
            repo.insert(note)
        }
    }


    fun updateNote(id: Long, title: String, content: String) {
        viewModelScope.launch {
            val note = Note(id = id, title = title, content = content)
            repo.update(note)
        }
    }


    fun deleteNote(note: Note) {
        viewModelScope.launch { repo.delete(note) }
    }
}


class NoteViewModelFactory(private val application: Application) : ViewModelProvider.AndroidViewModelFactory(application) {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NoteViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return NoteViewModel(application) as T
        }
        return super.create(modelClass)
    }
}