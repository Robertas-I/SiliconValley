package ivanavicius.robertas.view.home.adapter.diffCalbacks

import androidx.recyclerview.widget.DiffUtil
import ivanavicius.robertas.model.home.EpisodeListItemModel

class EpisodeListItemDiffCallback: DiffUtil.ItemCallback<EpisodeListItemModel>() {
    override fun areItemsTheSame(
        oldItem: EpisodeListItemModel,
        newItem: EpisodeListItemModel
    ): Boolean = oldItem.episodeNumber == newItem.episodeNumber

    override fun areContentsTheSame(
        oldItem: EpisodeListItemModel,
        newItem: EpisodeListItemModel
    ): Boolean = oldItem.episodeNumber == newItem.episodeNumber
}