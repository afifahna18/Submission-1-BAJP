package com.afifah.movoruapp.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.afifah.movoruapp.R
import com.afifah.movoruapp.data.DataEntity
import com.afifah.movoruapp.utils.DataMoviesDummy.TYPE_MOVIE
import com.afifah.movoruapp.utils.DataMoviesDummy.setGlideImage
import com.afifah.movoruapp.utils.DataTVShowDummy.TYPE_TVSHOW
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail_movies.*
import kotlinx.android.synthetic.main.items_row.view.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
        const val EXTRA_TYPE = "extra_type"
    }

    private lateinit var result: DataEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movies)

        supportActionBar?.title = "Detail Film"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(this@DetailActivity, ViewModelProvider.NewInstanceFactory())[DetailViewModel::class.java]


        val id = intent.getStringExtra(EXTRA_DATA)
        val type = intent.getStringExtra(EXTRA_TYPE)

        if (type.equals(TYPE_MOVIE, ignoreCase = true)) {
            id?.let {
                viewModel.setMovieId(it)
            }
            result = viewModel.getDetailMovieById()
        } else if (type.equals(TYPE_TVSHOW, ignoreCase = true)) {
            id?.let {
                viewModel.setTvShowId(it)
            }
            result = viewModel.getDetailTvShowById()
        }

        tv_detail_name.text = result.name
        tv_detail_date.text = result.date
        tv_detail_duration.text = result.duration
        tv_detail_genre.text = result.genre
        tv_detail_rate.text = result.rate
        tv_detail_storyline_description.text = result.storyline
        setGlideImage(this@DetailActivity, result.poster, img_poster)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}