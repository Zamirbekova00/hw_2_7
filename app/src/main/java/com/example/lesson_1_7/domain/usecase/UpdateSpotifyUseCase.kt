package com.example.lesson_1_7.domain.usecase

import com.example.lesson_1_7.data.models.SpotifyEntity
import com.example.lesson_1_7.domain.repositories.SpotifyRepository
import javax.inject.Inject

class UpdateSpotifyUseCase @Inject constructor(private val spotifyRepository: SpotifyRepository) {
    fun updateSpotify(spotifyEntity: SpotifyEntity) {
        spotifyRepository.updateSpotify(spotifyEntity)
    }
}