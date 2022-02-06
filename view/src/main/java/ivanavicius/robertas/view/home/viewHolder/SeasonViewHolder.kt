package ivanavicius.robertas.view.home.viewHolder

import androidx.recyclerview.widget.RecyclerView
import ivanavicius.robertas.model.home.EpisodeListItemModel
import ivanavicius.robertas.model.home.SeasonListItemModel
import ivanavicius.robertas.view.R
import ivanavicius.robertas.view.databinding.HolderSeasonViewBinding
import ivanavicius.robertas.view.home.adapter.EpisodesAdapter

class SeasonViewHolder(private val binding: HolderSeasonViewBinding): RecyclerView.ViewHolder(binding.root) {

    private val adapter = EpisodesAdapter()

    fun onBind(item: SeasonListItemModel){
        binding.title.text = itemView.context.getString(R.string.season, item.seasonNb)
        binding.episodes.adapter = adapter
        adapter.submitList(item.seasonEpisodes)
    }
}