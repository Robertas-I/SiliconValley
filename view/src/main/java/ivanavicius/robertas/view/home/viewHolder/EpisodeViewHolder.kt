package ivanavicius.robertas.view.home.viewHolder

import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import ivanavicius.robertas.model.home.EpisodeListItemModel
import ivanavicius.robertas.view.R
import ivanavicius.robertas.view.databinding.HolderEpisodeViewBinding
import ivanavicius.robertas.view.home.EpisodesListFragmentDirections

class EpisodeViewHolder(private val binding: HolderEpisodeViewBinding): RecyclerView.ViewHolder(binding.root) {

    private val picasso = Picasso.get()

    fun onBind(item: EpisodeListItemModel){
        picasso.cancelRequest(binding.image)
        picasso.load(item.image).into(binding.image)
        binding.episodeName.text = itemView.context.getString(R.string.episodeName, item.episodeNumber, item.episodeName)
        binding.root.setOnClickListener {
            it.findNavController().navigate(
                EpisodesListFragmentDirections.actionEpisodesListFragmentToEpisodeFragment(item.episodeModel)
            )
        }
    }
}