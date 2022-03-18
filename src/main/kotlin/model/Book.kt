package model

import com.google.gson.annotations.SerializedName

data class Book(

    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("author")
    val author: String,

    @SerializedName("isbn")
    val isbn: String,

    @SerializedName("type")
    val type: String,

    @SerializedName("price")
    val price: Double,

    @SerializedName("current-stock")
    val currentInStock: Int,

    @SerializedName("available")
    val isAvailable: Boolean

)