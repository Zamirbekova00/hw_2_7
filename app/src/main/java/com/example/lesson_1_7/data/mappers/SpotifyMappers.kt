package com.example.lesson_1_7.data.mappers

import com.example.lesson_1_7.data.models.SpotifyEntity
import com.example.lesson_1_7.domain.model.Spotify

fun Spotify.toEntity() = SpotifyEntity(id,executor,description, number, time)

fun SpotifyEntity.toSpotify() = Spotify(id,executor,description, number, time )