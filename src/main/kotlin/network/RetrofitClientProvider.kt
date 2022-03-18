package network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientProvider {

    fun provide(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://simple-books-api.glitch.me")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}