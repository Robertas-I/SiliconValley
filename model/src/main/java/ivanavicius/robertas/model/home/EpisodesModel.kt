package ivanavicius.robertas.model.home

import ivanavicius.robertas.api.entities.Seasons

class EpisodesModel(seasons: Seasons) {
    var episodes: List<SeasonListItemModel> = emptyList()
        private set

    init {
        episodes = seasons.seasons.map {
            SeasonListItemModel(
                it.episodes.firstOrNull()?.season?: 0,
                it.episodes
            )
        }
    }

}