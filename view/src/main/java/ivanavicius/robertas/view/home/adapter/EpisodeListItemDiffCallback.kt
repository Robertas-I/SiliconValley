package ivanavicius.robertas.view.home.adapter

import androidx.recyclerview.widget.DiffUtil
import ivanavicius.robertas.model.home.EpisodeListItemModel

class EpisodeListItemDiffCallback: DiffUtil.ItemCallback<EpisodeListItemModel>() {
    override fun areItemsTheSame(
        oldItem: EpisodeListItemModel,
        newItem: EpisodeListItemModel
    ): Boolean = false

    override fun areContentsTheSame(
        oldItem: EpisodeListItemModel,
        newItem: EpisodeListItemModel
    ): Boolean = false
}