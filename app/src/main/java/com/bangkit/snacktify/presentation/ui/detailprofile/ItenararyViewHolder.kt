package com.bangkit.snacktify.presentation.ui.detailprofile

import androidx.recyclerview.widget.RecyclerView
import com.bangkit.snacktify.databinding.LayoutItemBinding
import com.bangkit.snacktify.presentation.ui.Itenarary

class ItenararyViewHolder (

    private val layoutItemBinding: LayoutItemBinding,
    private val clickListener: CardClickListener
) : RecyclerView.ViewHolder(layoutItemBinding.root)
{
    fun bindBook(itenarary: Itenarary)
    {
        layoutItemBinding.cover.setImageResource(itenarary.cover)
        layoutItemBinding.title.text = itenarary.title
        layoutItemBinding.rating.setImageResource(itenarary.rating)
        layoutItemBinding.days.text = itenarary.days
        layoutItemBinding.budget.text = itenarary.budget

        layoutItemBinding.cardView.setOnClickListener{
            clickListener.onClick(itenarary)
        }
    }
}