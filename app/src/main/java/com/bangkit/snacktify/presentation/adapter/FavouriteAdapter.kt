package com.bangkit.snacktify.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bangkit.snacktify.databinding.ListFavouriteBinding
import com.bangkit.snacktify.presentation.ui.Favourite
import com.bangkit.snacktify.presentation.ui.favourite.FavouriteViewHolder
import com.bangkit.snacktify.presentation.ui.favourite.ListFavouriteListener

class FavouriteAdapter (
    private val favourite: List<Favourite>,
    private val listFavouriteListener: ListFavouriteListener
) : RecyclerView.Adapter<FavouriteViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavouriteViewHolder {

        val from = LayoutInflater.from(parent.context)
        val binding = ListFavouriteBinding.inflate(from, parent, false)
        return FavouriteViewHolder(binding, listFavouriteListener)
    }

    override fun onBindViewHolder(holder: FavouriteViewHolder, position: Int) {
        holder.bindList(favourite[position])
    }

    override fun getItemCount(): Int = favourite.size

}