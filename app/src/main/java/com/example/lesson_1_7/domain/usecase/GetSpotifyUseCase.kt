package com.example.lesson_1_7.domain.usecase

import com.example.lesson_1_7.data.models.SpotifyEntity
import com.example.lesson_1_7.domain.repositories.SpotifyRepository
import com.example.lesson_1_7.domain.utils.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSpotifyUseCase @Inject constructor(private val spotifyRepository: SpotifyRepository) {
    fun getSpotify(): Flow<List<Resource<SpotifyEntity>>> {
        return spotifyRepository.getSpotify()
    }
}