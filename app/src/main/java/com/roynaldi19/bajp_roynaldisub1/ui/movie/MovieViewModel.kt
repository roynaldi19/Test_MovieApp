package com.roynaldi19.bajp_roynaldisub1.ui.movie

import androidx.lifecycle.ViewModel
import com.roynaldi19.bajp_roynaldisub1.data.DataEntity
import com.roynaldi19.bajp_roynaldisub1.utils.DataDummy

class MovieViewModel : ViewModel() {

    fun getMovies(): List<DataEntity> = DataDummy.generateDummyMovie()

}