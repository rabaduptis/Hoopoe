package com.root14.hoopoe.view.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.root14.hoopoe.databinding.RwTop100Binding

class MainBottomSheetViewHolder(private val binding: RwTop100Binding) :
    RecyclerView.ViewHolder(binding.root) {
    fun binding(topList: String) {
        binding.top100 = topList
    }
}