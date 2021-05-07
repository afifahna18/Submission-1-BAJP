package com.afifah.movoruapp.content.tvshow


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.afifah.movoruapp.R
import com.afifah.movoruapp.content.ContentAdapter
import com.afifah.movoruapp.data.DataEntity
import com.afifah.movoruapp.detail.DetailActivity
import com.afifah.movoruapp.utils.DataTVShowDummy
import com.afifah.movoruapp.utils.DataTVShowDummy.TYPE_TVSHOW
import kotlinx.android.synthetic.main.fragment_movies.*
import kotlinx.android.synthetic.main.fragment_tvshow.*



class TVShowFragment : Fragment(), ContentAdapter.ContentCallback {

    private lateinit var viewModel : ContentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tvshow, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        activity?.let {
            viewModel = ViewModelProvider(it, ViewModelProvider.NewInstanceFactory())[ContentViewModel::class.java]
        }

        val listTVShow = viewModel.getListTVShow()
        setRecyler(listTVShow)
    }

    private fun setRecyler(data: List<DataEntity>) {
        rv_tv_show.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = ContentAdapter(this@TVShowFragment)
        }.also {
            it.adapter.let { adapter ->
                when (adapter) {
                    is ContentAdapter -> {
                        adapter.setData(data)
                    }
                }
            }
        }
    }

    override fun onItemClicked(data: DataEntity) {
        startActivity(
            Intent(context, DetailActivity::class.java)
                .putExtra(DetailActivity.EXTRA_DATA, data.name)
                .putExtra(DetailActivity.EXTRA_TYPE, TYPE_TVSHOW )
        )
    }

    class ContentViewModel: ViewModel() {
        fun getListTVShow() : List<DataEntity> = DataTVShowDummy.generateDummyTVShow()

    }
}


