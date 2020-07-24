package java.games.ecommerce.main.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.math.BigDecimal

data class Game (
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("image") val image: String,
    @SerializedName("price") val price: BigDecimal,
    @SerializedName("discount") val discount: BigDecimal,
    @SerializedName("description") val description: String,
    @SerializedName("rating") val rating: Double,
    @SerializedName("stars") val stars: Int,
    @SerializedName("publisher") val publisher: String,
    @SerializedName("reviews") val reviews: Int
) : Serializable