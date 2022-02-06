package ivanavicius.robertas.view.home.viewHolder

import androidx.navigation.findNavController
import com.squareup.picasso.Picasso
import ivanavicius.robertas.core.base.BaseViewHolder
import ivanavicius.robertas.model.home.EpisodeListItemModel
import ivanavicius.robertas.view.R
import ivanavicius.robertas.view.databinding.HolderEpisodeViewBinding
import ivanavicius.robertas.view.home.EpisodesListFragmentDirections

class EpisodeViewHolder(binding: HolderEpisodeViewBinding): BaseViewHolder<HolderEpisodeViewBinding, EpisodeListItemModel>(binding) {

    private val picasso = Picasso.get()

    override fun onBind(item: EpisodeListItemModel){
        picasso.cancelRequest(binding.image)
        picasso.load(item.image).into(binding.image)
        binding.episodeName.text = context.getString(R.string.episodeName, item.episodeNumber, item.episodeName)
        binding.root.setOnClickListener {
            it.findNavController().navigate(
                EpisodesListFragmentDirections.actionEpisodesListFragmentToEpisodeFragment(item.episodeModel)
            )
        }
    }
}