package com.eunma.eunmaassistant

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.eunma.eunmaassistant.databinding.ItemIconBinding

class IconAdapter(private val icons: List<Int>) : RecyclerView.Adapter<IconAdapter.IconViewHolder>() {

    class IconViewHolder(val binding: ItemIconBinding) : RecyclerView.ViewHolder(binding.root) {
        val iconImage: ImageView = binding.iconImage
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IconViewHolder {
        val binding = ItemIconBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return IconViewHolder(binding)
    }

    override fun onBindViewHolder(holder: IconViewHolder, position: Int) {
        holder.iconImage.setImageResource(icons[position])
    }

    override fun getItemCount() = icons.size
}