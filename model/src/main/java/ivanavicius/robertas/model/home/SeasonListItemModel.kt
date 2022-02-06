package ivanavicius.robertas.model.home

import ivanavicius.robertas.api.entities.Episode
import ivanavicius.robertas.core.base.BaseModel

class SeasonListItemModel(val seasonNb: Int, episodes: List<Episode>): BaseModel() {
    val seasonEpisodes = episodes.map { EpisodeListItemModel(it) }
}