package com.example.lesson_1_7.domain.repositories

import com.example.lesson_1_7.domain.utils.Resource
import com.example.lesson_1_7.data.models.SpotifyEntity
import kotlinx.coroutines.flow.Flow

interface SpotifyRepository {

    fun addSpotify(spotifyEntity: SpotifyEntity): Flow<Resource<Unit>>

    fun getSpotify(): Flow<List<Resource<SpotifyEntity>>>

    fun updateSpotify(spotifyEntity: SpotifyEntity): Flow<Resource<Unit>>

    fun deleteSpotify(spotifyEntity: SpotifyEntity): Flow<Resource<Unit>>

    fun getDescriptionForSpotify(spotifyEntity: SpotifyEntity):Flow<List<Resource<SpotifyEntity>>>

    fun getMusicByExecutor(spotifyEntity: SpotifyEntity):Flow<List<Resource<SpotifyEntity>>>
}