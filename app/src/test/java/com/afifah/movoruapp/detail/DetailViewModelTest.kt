package com.afifah.movoruapp.detail

import com.afifah.movoruapp.utils.DataMoviesDummy
import com.afifah.movoruapp.utils.DataTVShowDummy
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class DetailViewModelTest{
    private lateinit var detailViewModel: DetailViewModel
    private val dummyMovie = DataMoviesDummy.generateDummyMovies()[0]
    private val dummyTVShow = DataTVShowDummy.generateDummyTVShow()[0]

    @Before
    fun setUp() {
        detailViewModel = DetailViewModel()
    }

    @Test
    fun getDetailMovieById() {
        val movie = detailViewModel.getDetailMovieById()
        assertNotNull(movie)
        assertEquals(dummyMovie.name, movie.name)
        assertEquals(dummyMovie.storyline, movie.storyline)
        assertEquals(dummyMovie.genre, movie.genre)
        assertEquals(dummyMovie.date, movie.date)
        assertEquals(dummyMovie.duration, movie.duration)
        assertEquals(dummyMovie.rate, movie.rate)
        assertEquals(dummyMovie.poster, movie.poster)
    }

    @Test
    fun getDetailTvShowById() {
        val tvShow = detailViewModel.getDetailTvShowById()
        assertNotNull(tvShow)
        assertEquals(dummyTVShow.name, tvShow.name)
        assertEquals(dummyTVShow.storyline, tvShow.storyline)
        assertEquals(dummyTVShow.genre, tvShow.genre)
        assertEquals(dummyTVShow.date, tvShow.date)
        assertEquals(dummyTVShow.duration, tvShow.duration)
        assertEquals(dummyTVShow.rate, tvShow.rate)
        assertEquals(dummyTVShow.poster, tvShow.poster)
    }
}
