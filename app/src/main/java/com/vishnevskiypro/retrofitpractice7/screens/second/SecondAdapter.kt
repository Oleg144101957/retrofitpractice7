package com.vishnevskiypro.retrofitpractice7.screens.second

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice7.databinding.ItemMoneyBinding
import com.vishnevskiypro.retrofitpractice7.models.beznal.BeznalichkaItem

class SecondAdapter : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    inner class SecondViewHolder(val binding: ItemMoneyBinding) : RecyclerView.ViewHolder(binding.root)

    private val diffCallback = object : DiffUtil.ItemCallback<BeznalichkaItem>(){

        override fun areItemsTheSame(oldItem: BeznalichkaItem, newItem: BeznalichkaItem): Boolean {
            return oldItem.ccy == newItem.ccy
        }


        override fun areContentsTheSame(
            oldItem: BeznalichkaItem,
            newItem: BeznalichkaItem,
        ): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, diffCallback)
    var listBeznal: List<BeznalichkaItem>
        get() = differ.currentList
        set(value) { differ.submitList(value) }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        return SecondViewHolder(ItemMoneyBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
            )
        )
    }


    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.binding.apply {
            val beznalItem = listBeznal[position]
            itemName.text = beznalItem.ccy
            itemBuy.text = beznalItem.buy
            itemSale.text = beznalItem.sale
        }
    }


    override fun getItemCount() = listBeznal.size
}