package ivanavicius.robertas.api.entities

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Episode(
    @SerializedName("Plot")
    val plot: String
): Parcelable