package ivanavicius.robertas.core.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<VB: ViewBinding, M: BaseModel>(protected val binding: VB)
    : RecyclerView.ViewHolder(binding.root)
{
    abstract fun onBind(item: M)
}