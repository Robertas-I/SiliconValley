package ivanavicius.robertas.core.base

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<VB: ViewBinding, M: BaseModel>(protected val binding: VB)
    : RecyclerView.ViewHolder(binding.root)
{
    protected val context: Context get() =  itemView.context
    abstract fun onBind(item: M)
}