package com.example.lesson_1_7.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts")
data class SpotifyEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val executor: String,
    val description: String,
    val number: String,
    val time: String,
    )
