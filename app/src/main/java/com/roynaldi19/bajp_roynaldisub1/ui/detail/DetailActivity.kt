package com.roynaldi19.bajp_roynaldisub1.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.roynaldi19.bajp_roynaldisub1.data.DataEntity
import com.roynaldi19.bajp_roynaldisub1.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
        const val EXTRA_TVSHOW = "extra_tvshow"
    }

    private lateinit var activityDetailBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(activityDetailBinding.root)

        setSupportActionBar(activityDetailBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailViewModel::class.java]


        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getString(EXTRA_MOVIE)
            val tvShowId = extras.getString(EXTRA_TVSHOW)

            if (movieId != null) {
                viewModel.setSelectedMovie(movieId)
                loadDetailMovie(viewModel.getMovie() as DataEntity)
            }
            if (tvShowId != null) {
                viewModel.setSelectedTvShow(tvShowId)
                loadDetailTVShow(viewModel.getTvShow() as DataEntity)
            }
        }

    }

    private fun loadDetailMovie(dataEntity: DataEntity) {
        activityDetailBinding.textTitle.text = dataEntity.title
        activityDetailBinding.textDescription.text = dataEntity.description
        Glide.with(this)
                .load(dataEntity.imagePath)
                .into(activityDetailBinding.imagePoster)

    }

    private fun loadDetailTVShow(dataEntity: DataEntity) {
        activityDetailBinding.textTitle.text = dataEntity.title
        activityDetailBinding.textDescription.text = dataEntity.description
        Glide.with(this)
                .load(dataEntity.imagePath)
                .into(activityDetailBinding.imagePoster)
    }

}