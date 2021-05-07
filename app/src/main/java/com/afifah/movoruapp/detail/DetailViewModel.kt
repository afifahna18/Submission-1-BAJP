package com.afifah.movoruapp.detail

import androidx.lifecycle.ViewModel
import com.afifah.movoruapp.data.DataEntity
import com.afifah.movoruapp.utils.DataMoviesDummy
import com.afifah.movoruapp.utils.DataTVShowDummy


class DetailViewModel : ViewModel() {

    private lateinit var movieId: String
    private lateinit var tvShowId: String

    private fun getListMovie(): ArrayList<DataEntity> =
        DataMoviesDummy.generateDummyMovies() as ArrayList<DataEntity>

    private fun getListTvShow(): ArrayList<DataEntity> =
        DataTVShowDummy.generateDummyTVShow() as ArrayList<DataEntity>

    fun setMovieId(movieId: String) {
        this.movieId = movieId
    }

    fun setTvShowId(tvShowId: String) {
        this.tvShowId = tvShowId
    }

    fun getDetailMovieById(): DataEntity {
        lateinit var result: DataEntity
        val listMovie = getListMovie()
        for (movie in listMovie) {
            if (movie.name == movieId) {
                result = movie
                break
            }
        }
        return  result
    }

    fun getDetailTvShowById(): DataEntity {
        lateinit var result: DataEntity
        val listTvShow = getListTvShow()
        for (tvShow in listTvShow) {
            if (tvShow.name == tvShowId) {
                result = tvShow
                break
            }
        }
        return result
    }
}