package network

import model.Book
import retrofit2.http.GET
import retrofit2.http.Path

interface BookAPI {

    @GET("books")
    suspend fun all(): List<Book>

    @GET("books/{id}")
    suspend fun find(@Path("id") id: Int): Book

}