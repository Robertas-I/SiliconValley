package ivanavicius.robertas.core.base

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

abstract class BaseListAdapter<M: BaseModel>(diff: DiffUtil.ItemCallback<M>): ListAdapter<M, BaseViewHolder<*, BaseModel>>(diff){
     override fun onBindViewHolder(holder: BaseViewHolder<*, BaseModel>, position: Int) {
         holder.onBind(getItem(position))
     }
 }