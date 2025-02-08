package com.example.hungarianwordlockscreenapp.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.hungarianwordlockscreenapp.model.Word

@Dao
interface WordDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWord(word: Word)

    @Query("SELECT * FROM words ORDER BY RANDOM() LIMIT 1")
    suspend fun getRandomWord(): Word?

    @Query("DELETE FROM words WHERE id = :wordId")
    suspend fun deleteWord(wordId: Int)

    @Query("SELECT * FROM words")
    suspend fun getAllWords(): List<Word>
}