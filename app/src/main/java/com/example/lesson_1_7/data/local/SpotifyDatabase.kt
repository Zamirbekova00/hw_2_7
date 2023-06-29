package com.example.lesson_1_7.data.local
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.lesson_1_7.data.models.SpotifyEntity

@Database(entities = [SpotifyEntity::class], version = 1)
abstract class SpotifyDatabase : RoomDatabase() {

    abstract fun spotifyDao(): SpotifyDao
}