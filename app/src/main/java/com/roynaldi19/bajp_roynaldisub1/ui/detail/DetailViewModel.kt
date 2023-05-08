package com.roynaldi19.bajp_roynaldisub1.ui.detail

import androidx.lifecycle.ViewModel
import com.roynaldi19.bajp_roynaldisub1.data.DataEntity
import com.roynaldi19.bajp_roynaldisub1.utils.DataDummy

class DetailViewModel : ViewModel() {
    private lateinit var movieId: String
    private lateinit var tvShowId: String

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun getMovie(): DataEntity? {
        var movie: DataEntity? = null
        for (movieEntity in DataDummy.generateDummyMovie()) {
            if (movieEntity.id == movieId) {
                movie = movieEntity
            }
        }
        return movie
    }

    fun setSelectedTvShow(tvShowId: String) {
        this.tvShowId = tvShowId
    }

    fun getTvShow(): DataEntity? {
        var tvShow: DataEntity? = null
        for (tvShowEntity in DataDummy.generateDummyTVShow()) {
            if (tvShowEntity.id == tvShowId) {
                tvShow = tvShowEntity
            }
        }
        return tvShow
    }
}