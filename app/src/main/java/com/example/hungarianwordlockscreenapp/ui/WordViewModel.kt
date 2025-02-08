package com.example.hungarianwordlockscreenapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hungarianwordlockscreenapp.data.WordRepository
import com.example.hungarianwordlockscreenapp.model.Word
import kotlinx.coroutines.launch

class WordViewModel(private val repository: WordRepository) : ViewModel() {

    private val _currentWord = MutableLiveData<Word>()
    val currentWord: LiveData<Word> get() = _currentWord

    init {
        fetchRandomWord()
    }

    private fun fetchRandomWord() {
        viewModelScope.launch {
            _currentWord.value = repository.getRandomWord()
        }
    }

    fun updateWord() {
        fetchRandomWord()
    }
}