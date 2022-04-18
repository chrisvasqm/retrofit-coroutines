package network

import data.model.Book
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface BookAPI {

    @GET("books")
    suspend fun all(): Response<List<Book>>

    @GET("books/{id}")
    suspend fun find(@Path("id") id: Int): Response<Book>

}