package ivanavicius.robertas.view.home

import android.view.LayoutInflater
import android.view.ViewGroup
import ivanavicius.robertas.core.BaseFragment
import ivanavicius.robertas.view.databinding.FragmentEpisodeBinding

class EpisodeFragment: BaseFragment<FragmentEpisodeBinding>() {

    override fun initViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentEpisodeBinding.inflate(inflater, container, false)
}