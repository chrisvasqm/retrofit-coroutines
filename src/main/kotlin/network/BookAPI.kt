package network

import model.Book
import retrofit2.Call
import retrofit2.http.GET

interface BookAPI {

    @GET("books")
    fun all(): Call<List<Book>>

}