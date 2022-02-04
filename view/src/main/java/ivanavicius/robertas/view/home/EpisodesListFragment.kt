package ivanavicius.robertas.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import ivanavicius.robertas.core.BaseFragment
import ivanavicius.robertas.view.databinding.FragmentEpisodesListBinding
import ivanavicius.robertas.viewmodel.home.EpisodesViewModel

class EpisodesListFragment: BaseFragment<FragmentEpisodesListBinding>() {

    private val viewModel: EpisodesViewModel by viewModels()

    override fun initViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentEpisodesListBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getData()
        viewModel.model.observe(viewLifecycleOwner) {

        }
    }
}