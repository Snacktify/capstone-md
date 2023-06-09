package com.bangkit.snacktify.presentation.ui.upload

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.snacktify.R
import com.bangkit.snacktify.databinding.ActivityDestinationDetailBinding
import com.bumptech.glide.Glide
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class DestinationDetailActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var binding: ActivityDestinationDetailBinding
    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDestinationDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name = intent.getStringExtra(EXTRA_NAME)
        val desc = intent.getStringExtra(EXTRA_DESC)
        val address = intent.getStringExtra(EXTRA_ADDRESS)
        val phone = intent.getStringExtra(EXTRA_PHONE)

        val operational = intent.getStringExtra(EXTRA_OPERATIONAL)


        val imageView = findViewById<ImageView>(R.id.detailImg)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        binding.detailName.text = name
        binding.locatianDetail.text = address
        binding.phoneDetail.text = phone
        binding.clockDetail.text = operational
        binding.detailDesc.text = desc

        val objectImage = intent.getStringExtra(EXTRA_IMG)

        Glide.with(this)
            .load(objectImage)
            .into(imageView)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.uiSettings.isZoomControlsEnabled = true
        mMap.uiSettings.isIndoorLevelPickerEnabled = true
        mMap.uiSettings.isCompassEnabled = true
        mMap.uiSettings.isMapToolbarEnabled = true

        val latitude: Double = intent.getStringExtra(EXTRA_LATITUDE).toString().toDouble()
        val longitude: Double = intent.getStringExtra(EXTRA_LONGITUDE).toString().toDouble()

        val sydney = LatLng(latitude, longitude)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
        mMap.moveCamera(CameraUpdateFactory.zoomTo(15f))
    }

    companion object {
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_ADDRESS = "extra_address"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_LATITUDE = "extra_latitude"
        const val EXTRA_LONGITUDE = "extra_longitude"
        const val EXTRA_OPERATIONAL = "extra_operational"
    }
}