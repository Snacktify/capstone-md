package com.bangkit.snacktify.presentation.ui.detailprofile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.bangkit.snacktify.R
import com.bangkit.snacktify.databinding.ActivityDetailProfileBinding
import com.bangkit.snacktify.presentation.adapter.ItenararyAdapter
import com.bangkit.snacktify.presentation.ui.ITENARARY_ID_EXTRA
import com.bangkit.snacktify.presentation.ui.Itenarary
import com.bangkit.snacktify.presentation.ui.detailItenarary.DetailItineraryActivity
import com.bangkit.snacktify.presentation.ui.itenararyList

class DetailProfileActivity : AppCompatActivity(), CardClickListener {

    private lateinit var binding: ActivityDetailProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populatedItenarary()

        val detailProfileActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 2)
            adapter = ItenararyAdapter(itenararyList, detailProfileActivity)
        }
    }

    private fun populatedItenarary() {
        val itenarary1 = Itenarary(
            R.drawable.wisata_jogja,
            "Kue Putu Ayu, Jawa Tengah",
            R.drawable.ic_star,
            "Kuat Sampai 2-3 hari kedepan",
            "Budget : Rp. 65.000"
        )
        itenararyList.add(itenarary1)
        itenararyList.add(itenarary1)
        itenararyList.add(itenarary1)
        itenararyList.add(itenarary1)
    }

    override fun onClick(itenarary: Itenarary) {
        val intent = Intent(applicationContext, DetailItineraryActivity::class.java)
        intent.putExtra(ITENARARY_ID_EXTRA, itenarary.id)
        startActivity(intent)
    }

}