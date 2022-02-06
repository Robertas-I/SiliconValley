package ivanavicius.robertas.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import ivanavicius.robertas.core.BaseFragment
import ivanavicius.robertas.view.R
import ivanavicius.robertas.view.databinding.FragmentEpisodeBinding

class EpisodeFragment: BaseFragment<FragmentEpisodeBinding>() {

    override fun initViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentEpisodeBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        EpisodeFragmentArgs.fromBundle(requireArguments()).episode.also {
            binding.title.text = getString(R.string.fullName, it.seasonNumber, it.episodeNumber, it.episodeName)
            Picasso.get().load(it.image).into(binding.image)
            binding.summary.text = it.summary
        }

    }
}