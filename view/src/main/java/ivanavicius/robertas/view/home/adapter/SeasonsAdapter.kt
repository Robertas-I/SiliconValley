package ivanavicius.robertas.view.home.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ivanavicius.robertas.core.extensions.getLayoutInflater
import ivanavicius.robertas.model.home.EpisodeListItemModel
import ivanavicius.robertas.view.databinding.HolderSeasonViewBinding
import ivanavicius.robertas.view.home.viewHolder.SeasonViewHolder

class SeasonsAdapter: ListAdapter<EpisodeListItemModel, SeasonViewHolder>(EpisodeListItemDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        SeasonViewHolder(
            HolderSeasonViewBinding.inflate(parent.getLayoutInflater(), parent, false)
        )

    override fun onBindViewHolder(holder: SeasonViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }
}