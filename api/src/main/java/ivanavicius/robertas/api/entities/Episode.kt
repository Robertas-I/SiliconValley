package ivanavicius.robertas.api.entities

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Episode(
    @SerializedName("Title")
    val title: String,
    @SerializedName("Plot")
    val plot: String,
    @SerializedName("Poster")
    val poster: String,
    @SerializedName("Season")
    val season: Int,
    @SerializedName("Episode")
    val episode: Int,
    val imdbRating: Float
): Parcelable