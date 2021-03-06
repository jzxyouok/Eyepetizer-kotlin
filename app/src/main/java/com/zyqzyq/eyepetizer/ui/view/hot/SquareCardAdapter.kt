package com.zyqzyq.eyepetizer.ui.view.hot

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.DrawableRequestBuilder
import com.bumptech.glide.Glide
import com.zyqzyq.eyepetizer.R
import com.zyqzyq.eyepetizer.mvp.model.bean.HomeItem

class SquareCardAdapter: RecyclerView.Adapter<SquareCardAdapter.ViewHolder>(){
    private val TYPE_SQUARE_CARD = 1
    private val TYPE_ACTION_CARD = 2
    val data: ArrayList<HomeItem> by lazy { ArrayList<HomeItem>() }
    override fun getItemCount(): Int {
        return data.size
    }
    fun setItemList(itemList: ArrayList<HomeItem>){
        data.clear()
        data.addAll(itemList)
        notifyDataSetChanged()
    }
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val itemViewType = getItemViewType(position)
        when(itemViewType){
            TYPE_SQUARE_CARD -> (holder?.itemView as ImageView).let {
                Glide.with(it.context).load(data[position].data?.image).centerCrop().into(it)
            }
            TYPE_ACTION_CARD -> (holder?.itemView as TextView).text = data[position].data?.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        when(viewType){
            TYPE_SQUARE_CARD -> {
                val imageView = ImageView(parent?.context)
                imageView.layoutParams = RecyclerView.LayoutParams(250,RecyclerView.LayoutParams.MATCH_PARENT)
                return ViewHolder(imageView)
            }
            else -> {
                val textView = TextView(parent?.context)
                textView.background = parent?.context?.resources?.getDrawable(R.drawable.txt_sharp)
                textView.gravity = Gravity.CENTER
                val lp = RecyclerView.LayoutParams(250,
                        RecyclerView.LayoutParams.MATCH_PARENT)
//                lp.setMargins(10,10,10,10)
                textView.layoutParams = lp
                return ViewHolder(textView)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(data[position].type){
            "squareCard" -> TYPE_SQUARE_CARD
            "actionCard" -> TYPE_ACTION_CARD
            else -> 0
        }
    }
    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView)
}