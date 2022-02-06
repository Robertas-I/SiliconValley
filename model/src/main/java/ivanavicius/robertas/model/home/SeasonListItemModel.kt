package ivanavicius.robertas.model.home

import ivanavicius.robertas.api.entities.Episode

class SeasonListItemModel(val seasonNb: Int, episodes: List<Episode>) {
    val seasonEpisodes = episodes.map { EpisodeListItemModel(it) }
}