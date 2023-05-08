package com.roynaldi19.bajp_roynaldisub1.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.roynaldi19.bajp_roynaldisub1.data.DataEntity
import com.roynaldi19.bajp_roynaldisub1.databinding.ItemsTvShowBinding
import com.roynaldi19.bajp_roynaldisub1.ui.detail.DetailActivity
import java.util.*

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {
    private var listTvShows = ArrayList<DataEntity>()

    fun setTvShow(movies: List<DataEntity>?) {
        if (movies == null) return
        this.listTvShows.clear()
        this.listTvShows.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemsTvShowBinding = ItemsTvShowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemsTvShowBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvShow = listTvShows[position]
        holder.bind(tvShow)
    }

    override fun getItemCount(): Int = listTvShows.size


    class TvShowViewHolder(private val binding: ItemsTvShowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: DataEntity) {
            with(binding) {
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_TVSHOW, tvShow.id)
                    itemView.context.startActivity(intent)
                }
                tvItemTitle.text = tvShow.title
                Glide.with(itemView.context)
                        .load(tvShow.imagePath)
                        .into(imgPoster)
            }

        }
    }
}

