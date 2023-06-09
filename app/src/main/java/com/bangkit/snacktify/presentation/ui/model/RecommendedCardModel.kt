package com.bangkit.snacktify.presentation.ui.model

import com.bangkit.snacktify.R

data class RecommendedCardModel(
    val recommendedImage: Int,
    val recommendedTitle: String
)

val RecommendedCardModelList = listOf(
    RecommendedCardModel(
        R.drawable.wisata_lombok,
        "Lombok"
    ),
    RecommendedCardModel(
        R.drawable.wisata_malang,
        "Malang"
    ),
    RecommendedCardModel(
        R.drawable.wisata_raja_ampat,
        "Raja Ampat"
    ),
    RecommendedCardModel(
        R.drawable.wisata_pulau_seribu,
        "Pulau Seribu"
    )
)