package com.example.lesson_1_7.data.local

import androidx.room.*
import com.example.lesson_1_7.data.models.SpotifyEntity
import com.example.lesson_1_7.domain.model.Spotify

@Dao
interface SpotifyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addSpotify(spotifyEntity: Spotify)

    @Query("SELECT * FROM musics")
    suspend fun getSpotify(): List<SpotifyEntity>

    @Update
    suspend fun updateSpotify(spotifyEntity: Spotify)

    @Delete
    suspend fun deleteSpotify(spotifyEntity: Spotify)

    @Query("SELECT * FROM musics ORDER BY executor ASC")
    suspend fun getMusicByExecutor(): List<SpotifyEntity>

    @Query("SELECT * FROM task ORDER BY id DESC")
    suspend fun getDescriptionForSpotify():List<SpotifyEntity>
}