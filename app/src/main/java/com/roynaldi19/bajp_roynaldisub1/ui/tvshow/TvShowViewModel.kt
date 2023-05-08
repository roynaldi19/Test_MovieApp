package com.roynaldi19.bajp_roynaldisub1.ui.tvshow

import androidx.lifecycle.ViewModel
import com.roynaldi19.bajp_roynaldisub1.data.DataEntity
import com.roynaldi19.bajp_roynaldisub1.utils.DataDummy

class TvShowViewModel : ViewModel() {

    fun getTvShows(): List<DataEntity> = DataDummy.generateDummyTVShow()
}