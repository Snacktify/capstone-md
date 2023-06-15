package com.bangkit.snacktify.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.snacktify.databinding.LayoutItemBinding
import com.bangkit.snacktify.presentation.ui.Itenarary
import com.bangkit.snacktify.presentation.ui.detailprofile.CardClickListener
import com.bangkit.snacktify.presentation.ui.detailprofile.ItenararyViewHolder

class ItenararyAdapter(
    private val itenarary: List<Itenarary>,
    private val clickListener: CardClickListener
) : RecyclerView.Adapter<ItenararyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItenararyViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = LayoutItemBinding.inflate(from, parent, false)
        return ItenararyViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: ItenararyViewHolder, position: Int) {
        holder.bindBook(itenarary[position])
    }

    override fun getItemCount(): Int = itenarary.size
}