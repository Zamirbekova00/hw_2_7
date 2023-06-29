package com.example.lesson_1_7.data.repositories

import com.example.lesson_1_7.data.local.SpotifyDao
import com.example.lesson_1_7.data.mappers.toSpotify
import com.example.lesson_1_7.data.models.SpotifyEntity
import com.example.lesson_1_7.domain.repositories.SpotifyRepository
import com.example.lesson_1_7.domain.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class SpotifyRepositoryImpl @Inject constructor(private val spotifyDao: SpotifyDao) :
    SpotifyRepository {
    override fun addSpotify(spotifyEntity: SpotifyEntity): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = spotifyDao.addSpotify(spotifyEntity.toSpotify())
                emit(Resource.Success(data))
            }catch (e:Exception){
                emit(Resource.Error(e.localizedMessage?:"unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun getSpotify(): Flow<List<Resource<SpotifyEntity>>> {
        // вот здесь выходит ошибка, кажется я не правильно написала из за этого закомментировала
//        return flow {
//            emit(Resource.Loading())
//            try {
//                val list = musicDao.getMusic()
//                val data = list.map { it.toMusic() }
//                emit(Resource.Success(data))
//            } catch (e: java.lang.Exception) {
//                emit(Resource.Error(e.localizedMessage ?: "unknown error"))
//            }
//        }.flowOn(Dispatchers.IO)
    }

    override fun updateSpotify(spotifyEntity: SpotifyEntity): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = spotifyDao.updateSpotify(spotifyEntity.toSpotify())
                emit(Resource.Success(data))
            }catch (e:Exception){
                emit(Resource.Error(e.localizedMessage?:"unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun deleteSpotify(spotifyEntity: SpotifyEntity): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = spotifyDao.deleteSpotify(spotifyEntity.toSpotify())
                emit(Resource.Success(data))
            }catch (e:Exception){
                emit(Resource.Error(e.localizedMessage?:"unknown error"))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun getDescriptionForSpotify(spotifyEntity: SpotifyEntity): Flow<List<Resource<SpotifyEntity>>> {
        TODO("Not yet implemented")
    }

    override fun getMusicByExecutor(spotifyEntity: SpotifyEntity): Flow<List<Resource<SpotifyEntity>>> {
        TODO("Not yet implemented")
    }
}