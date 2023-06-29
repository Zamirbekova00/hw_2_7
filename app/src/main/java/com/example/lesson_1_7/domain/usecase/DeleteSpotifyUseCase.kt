package com.example.lesson_1_7.domain.usecase

import com.example.lesson_1_7.data.models.SpotifyEntity
import com.example.lesson_1_7.domain.repositories.SpotifyRepository
import javax.inject.Inject

class DeleteSpotifyUseCase @Inject constructor(private val spotifyRepository: SpotifyRepository) {
    fun deleteSpotify(spotifyEntity: SpotifyEntity){
        spotifyRepository.deleteSpotify(spotifyEntity)
    }
}