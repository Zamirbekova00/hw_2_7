package com.example.lesson_1_7.domain.usecase

import com.example.lesson_1_7.data.models.SpotifyEntity
import com.example.lesson_1_7.domain.repositories.SpotifyRepository
import javax.inject.Inject

class GetMusicByExecutorUseCase @Inject constructor(private val spotifyRepository: SpotifyRepository) {
    fun getMusicByExecutor(spotifyEntity: SpotifyEntity) {
        spotifyRepository.getMusicByExecutor(spotifyEntity)
    }

}