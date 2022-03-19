package network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientProvider {

    val instance: Retrofit = Retrofit.Builder()
        .baseUrl("https://simple-books-api.glitch.me")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}