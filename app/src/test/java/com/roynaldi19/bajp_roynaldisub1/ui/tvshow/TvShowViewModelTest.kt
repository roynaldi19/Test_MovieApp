package com.roynaldi19.bajp_roynaldisub1.ui.tvshow

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel

    @Before
    fun setUp() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getTvShow() {
        val TvShowEntities = viewModel.getTvShows()
        assertNotNull(TvShowEntities)
        assertEquals(10, TvShowEntities.size)
    }
}