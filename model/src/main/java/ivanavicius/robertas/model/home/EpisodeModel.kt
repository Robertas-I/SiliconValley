package ivanavicius.robertas.model.home

import android.os.Parcelable
import ivanavicius.robertas.api.entities.Episode
import kotlinx.parcelize.Parcelize

@Parcelize
data class EpisodeModel(private val episode: Episode): Parcelable {
    val episodeName: String get() = episode.title
    val episodeNumber: Int get() = episode.episode
    val seasonNumber: Int get() = episode.season
    val image: String get() = episode.poster
    val summary: String get() = episode.plot
}