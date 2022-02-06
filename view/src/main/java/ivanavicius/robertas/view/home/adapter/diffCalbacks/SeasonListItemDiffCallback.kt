package ivanavicius.robertas.view.home.adapter.diffCalbacks

import androidx.recyclerview.widget.DiffUtil
import ivanavicius.robertas.model.home.EpisodeListItemModel
import ivanavicius.robertas.model.home.SeasonListItemModel

class SeasonListItemDiffCallback: DiffUtil.ItemCallback<SeasonListItemModel>() {
    override fun areItemsTheSame(
        oldItem: SeasonListItemModel,
        newItem: SeasonListItemModel
    ): Boolean = oldItem.seasonNb == newItem.seasonNb

    override fun areContentsTheSame(
        oldItem: SeasonListItemModel,
        newItem: SeasonListItemModel
    ): Boolean = oldItem.seasonEpisodes.count() == newItem.seasonEpisodes.count()
}