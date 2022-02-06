package ivanavicius.robertas.view.home.adapter

import android.view.ViewGroup
import ivanavicius.robertas.core.base.BaseListAdapter
import ivanavicius.robertas.core.base.BaseModel
import ivanavicius.robertas.core.base.BaseViewHolder
import ivanavicius.robertas.core.extensions.getLayoutInflater
import ivanavicius.robertas.model.home.EpisodeListItemModel
import ivanavicius.robertas.view.databinding.HolderEpisodeViewBinding
import ivanavicius.robertas.view.home.adapter.diffCalbacks.EpisodeListItemDiffCallback
import ivanavicius.robertas.view.home.viewHolder.EpisodeViewHolder

class EpisodesAdapter: BaseListAdapter<EpisodeListItemModel>(EpisodeListItemDiffCallback()) {
    @Suppress("UNCHECKED_CAST")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*, BaseModel> =
        EpisodeViewHolder(
            HolderEpisodeViewBinding.inflate(parent.getLayoutInflater(), parent, false)
        ) as BaseViewHolder<*, BaseModel>
}