package com.example.lesson_1_7.presentation.di

import android.content.Context
import androidx.room.Room
import com.example.lesson_1_7.data.local.SpotifyDao
import com.example.lesson_1_7.data.local.SpotifyDatabase
import com.example.lesson_1_7.data.repositories.SpotifyRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ContactModule {

    @Singleton
    @Provides
    fun provideRoomDataBase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        SpotifyDatabase::class.java,
        "contacts"
    )

    @Provides
    fun provideContactDao(contactDatabase: SpotifyDatabase) = contactDatabase.contactDao()

    @Provides
    fun provideContactRepository(contactDao: SpotifyDao):
            SpotifyRepositoryImpl = SpotifyRepositoryImpl(contactDao)
}
