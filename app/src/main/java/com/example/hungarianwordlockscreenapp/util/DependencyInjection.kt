package com.example.hungarianwordlockscreenapp.util

import android.app.Application
import com.example.hungarianwordlockscreenapp.data.WordRepository
import com.example.hungarianwordlockscreenapp.data.local.WordDatabase
import com.example.hungarianwordlockscreenapp.ui.WordViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object DependencyInjection {

    @Provides
    @Singleton
    fun provideWordDatabase(application: Application): WordDatabase {
        return WordDatabase.getDatabase(application)
    }

    @Provides
    @Singleton
    fun provideWordRepository(database: WordDatabase): WordRepository {
        return WordRepository(database.wordDao())
    }
}