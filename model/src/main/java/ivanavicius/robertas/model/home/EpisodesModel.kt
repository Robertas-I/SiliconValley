package ivanavicius.robertas.model.home

import ivanavicius.robertas.api.entities.Seasons

class EpisodesModel(seasons: Seasons) {
    var episodes: List<EpisodeListItemModel> = emptyList()
        private set

    init {
        episodes = seasons.seasons.flatMap {
            it.episodes.map { episode ->
                EpisodeListItemModel(episode)
            }
        }
    }

}