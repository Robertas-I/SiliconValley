package ivanavicius.robertas.view.home.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ivanavicius.robertas.core.extensions.getLayoutInflater
import ivanavicius.robertas.model.home.EpisodeListItemModel
import ivanavicius.robertas.view.databinding.HolderEpisodeViewBinding
import ivanavicius.robertas.view.home.adapter.diffCalbacks.EpisodeListItemDiffCallback
import ivanavicius.robertas.view.home.viewHolder.EpisodeViewHolder

class EpisodesAdapter: ListAdapter<EpisodeListItemModel, EpisodeViewHolder>(EpisodeListItemDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        EpisodeViewHolder(
            HolderEpisodeViewBinding.inflate(parent.getLayoutInflater(), parent, false)
        )

    override fun onBindViewHolder(holder: EpisodeViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }
}