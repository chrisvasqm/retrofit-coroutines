package data

import retrofit2.Response

interface Repository<E> {
    suspend fun all(): Response<List<E>>
    suspend fun find(id: Int): Response<E>
}