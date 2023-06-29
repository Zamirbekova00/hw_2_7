package com.example.lesson_1_7.domain.usecase

import com.example.lesson_1_7.data.models.SpotifyEntity
import com.example.lesson_1_7.domain.repositories.SpotifyRepository
import javax.inject.Inject

class GetDescriptionUseCase @Inject constructor(private val spotifyRepository: SpotifyRepository) {
    fun getDescriptionForSpotify(spotifyEntity: SpotifyEntity) {
        spotifyRepository.getDescriptionForSpotify(spotifyEntity)
    }
}