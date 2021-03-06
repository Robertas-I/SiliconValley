package ivanavicius.robertas.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB: ViewBinding>: Fragment() {

    private var viewBinding: VB? = null
    protected val binding get() = viewBinding!!

    abstract fun initViewBinding(inflater: LayoutInflater, container: ViewGroup?): VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = initViewBinding(inflater, container).also {
        viewBinding = it
    }.root

    override fun onDestroyView() {
        super.onDestroyView()
        viewBinding = null
    }


}