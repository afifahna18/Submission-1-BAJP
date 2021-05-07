package com.afifah.movoruapp.content

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.afifah.movoruapp.R
import com.afifah.movoruapp.data.DataEntity
import com.bumptech.glide.Glide

import kotlinx.android.synthetic.main.items_row.view.*
import kotlinx.android.synthetic.main.items_row.view.img_poster
import kotlinx.android.synthetic.main.items_row.view.tv_movie_name
import java.util.ArrayList

class ContentAdapter(private val callback: ContentCallback): RecyclerView.Adapter<ContentAdapter.ListViewHolder>() {

    private val listdata = ArrayList<DataEntity>()

    fun setData(data: List<DataEntity>){
        if (data == null) return
        listdata.clear()
        listdata.addAll(data)
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind (data: DataEntity){
            with(itemView) {
                tv_movie_name.text = data.name


                Glide.with(itemView.context)
                    .load(data.poster)
                    .into(img_poster)

                item_card.setOnClickListener {
                    callback.onItemClicked(data)
                }
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder =
        ListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.items_row, parent, false)
        )


    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listdata[position])
    }

    override fun getItemCount(): Int = listdata.size

    interface ContentCallback {
        fun onItemClicked(data: DataEntity)
    }

}


