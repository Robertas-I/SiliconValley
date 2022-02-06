package ivanavicius.robertas.model.home

import ivanavicius.robertas.api.entities.Episode
import ivanavicius.robertas.core.base.BaseModel

class EpisodeListItemModel(episode: Episode): BaseModel() {
    val episodeName = episode.title
    val episodeNumber = episode.episode
    val image = episode.poster

    val episodeModel = EpisodeModel(episode)
}