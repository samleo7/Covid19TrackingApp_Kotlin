package com.example.covid19tracking

import java.util.*

data class CovidData (
        val dateChecked:Date,
        val positiveIncrease: Int,
        val negativeIncrease: Int,
        val deathIncrease: Int,
        val state:String
        )