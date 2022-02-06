package ivanavicius.robertas.model.home

import ivanavicius.robertas.api.entities.Episode

class EpisodeListItemModel(episode: Episode) {
    val episodeName = episode.title
    val episodeNumber = episode.episode
    val image = episode.poster

    val episodeModel = EpisodeModel(episode)
}