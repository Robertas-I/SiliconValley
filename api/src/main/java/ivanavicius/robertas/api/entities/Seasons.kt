package ivanavicius.robertas.api.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Seasons(
    val seasons: List<Season>
): Parcelable