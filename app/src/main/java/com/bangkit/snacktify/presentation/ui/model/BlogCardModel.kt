package com.bangkit.snacktify.presentation.ui.model

import com.bangkit.snacktify.R

data class BlogCardModel(
    val blogImg: Int,
    val blogAvtr: Int,
    val blogName: String,
    val blogDesc: String,
    val blogDate: String,
    val blogView: String,
    val blogLike: String
)

val BlogCardModelList = listOf(
    BlogCardModel(
        blogImg = R.drawable.wisata_jogja,
        blogAvtr = R.drawable.putu_ayu,
        blogName = "Putu Ayu",
        blogDesc = "Kue Khas Jawa Tengah",
        blogDate = "25 Juni",
        blogView = "20rb",
        blogLike = "2rb"
    ),
    BlogCardModel(
        blogImg = R.drawable.wisata_jogja,
        blogAvtr = R.drawable.klepon,
        blogName = "Klepon",
        blogDesc = "Kue Khas Jawa, Sumatra dan Sulawesi.",
        blogDate = "2 Juni",
        blogView = "17rb",
        blogLike = "1rb"
    ),
    BlogCardModel(
        blogImg = R.drawable.wisata_jogja,
        blogAvtr = R.drawable.getuk,
        blogName = "Getuk",
        blogDesc = "Getuk adalah makanan ringan yang berasal dari Magelang, Jawa Tengah",
        blogDate = "2 Juni",
        blogView = "19rb",
        blogLike = "3rb"
    ),
    BlogCardModel(
        blogImg = R.drawable.jabar,
        blogAvtr = R.drawable.asinan,
        blogName = "Asinan",
        blogDesc = "Asinan buah adalah salah satu kuliner olahan buah-buahan dari jawa barat",
        blogDate = "22 Juli",
        blogView = "15rb",
        blogLike = "1rb"
    )
)