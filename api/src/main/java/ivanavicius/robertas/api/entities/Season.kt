package ivanavicius.robertas.api.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Season(
    val episodes: List<Episode>
): Parcelable