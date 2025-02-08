package com.example.hungarianwordlockscreenapp.data

import com.example.hungarianwordlockscreenapp.data.local.WordDao
import com.example.hungarianwordlockscreenapp.model.Word
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {

    fun getAllWords(): Flow<List<Word>> {
        return wordDao.getAllWords()
    }

    suspend fun insertWord(word: Word) {
        wordDao.insertWord(word)
    }

    suspend fun deleteWord(word: Word) {
        wordDao.deleteWord(word)
    }

    suspend fun getWordById(id: Int): Word? {
        return wordDao.getWordById(id)
    }
}