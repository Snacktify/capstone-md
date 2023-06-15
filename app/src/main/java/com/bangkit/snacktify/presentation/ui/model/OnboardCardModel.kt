package com.bangkit.snacktify.presentation.ui.model

import com.bangkit.snacktify.R

data class OnboardCardModel(
    val onboardImage: Int,
    val onboardTitle: String
)

val OnboardCardModelList = listOf(
    OnboardCardModel(
        R.drawable.banner_1,
        "Temukan Rencana Makanan Impianmu!"
    ),
    OnboardCardModel(
        R.drawable.banner_2,
        "Kenali Asal Makananmu dan kalori!"
    ),
    OnboardCardModel(
        R.drawable.banner_3,
        "Rasakan Pengalaman Terbaik!"
    )
)