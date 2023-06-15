package com.bangkit.snacktify.presentation.ui.favourite

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.bangkit.snacktify.R
import com.bangkit.snacktify.databinding.ActivityFavouriteBinding
import com.bangkit.snacktify.presentation.adapter.FavouriteAdapter
import com.bangkit.snacktify.presentation.ui.FAV_ID_EXTRA
import com.bangkit.snacktify.presentation.ui.Favourite
import com.bangkit.snacktify.presentation.ui.FavouriteDetailActivity
import com.bangkit.snacktify.presentation.ui.favList

class FavouriteActivity : AppCompatActivity(), ListFavouriteListener {

    private lateinit var  binding: ActivityFavouriteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavouriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populatedListFav()

        val favouriteActivity = this
        binding.recyclerView2.apply {
            layoutManager = GridLayoutManager(applicationContext, 1)
            adapter = FavouriteAdapter(favList, favouriteActivity)
        }
    }

    private fun populatedListFav() {
        val fav1 = Favourite(
            R.drawable.favorite_1,
            "Fotografer",
            "Sabrina",
            R.drawable.ic_star,
            R.drawable.ic_place_favourite,
            "Malang",
            "Rp 250.000"
        )
        favList.add(fav1)
        val fav2 = Favourite(
            R.drawable.favorite_2,
            "Paket Wisata",
            "Lombok",
            R.drawable.ic_star,
            R.drawable.ic_durasi,
            "5 hari 4 malam",
            "Rp 7.500.000/orang"
        )
        favList.add(fav2)
        val fav3 = Favourite(
            R.drawable.favorite_3,
            "Pemandu Wisata",
            "Yanto",
            R.drawable.ic_star,
            R.drawable.ic_place_favourite,
            "Jakarta",
            "Rp 450.000"
        )
        favList.add(fav3)
        favList.add(fav1)
        favList.add(fav1)
    }

    override fun onClick(favourite: Favourite) {
        val intent = Intent(applicationContext, FavouriteDetailActivity::class.java)
        intent.putExtra(FAV_ID_EXTRA, favourite.id)
        startActivity(intent)
    }
}