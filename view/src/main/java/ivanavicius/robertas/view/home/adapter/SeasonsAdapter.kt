package ivanavicius.robertas.view.home.adapter

import android.view.ViewGroup
import ivanavicius.robertas.core.base.BaseListAdapter
import ivanavicius.robertas.core.base.BaseModel
import ivanavicius.robertas.core.base.BaseViewHolder
import ivanavicius.robertas.core.extensions.getLayoutInflater
import ivanavicius.robertas.model.home.SeasonListItemModel
import ivanavicius.robertas.view.databinding.HolderSeasonViewBinding
import ivanavicius.robertas.view.home.adapter.diffCalbacks.SeasonListItemDiffCallback
import ivanavicius.robertas.view.home.viewHolder.SeasonViewHolder

class SeasonsAdapter: BaseListAdapter<SeasonListItemModel>(SeasonListItemDiffCallback()) {

    @Suppress("UNCHECKED_CAST")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*, BaseModel> =
        SeasonViewHolder(
            HolderSeasonViewBinding.inflate(parent.getLayoutInflater(), parent, false)
        ) as BaseViewHolder<*, BaseModel>
}