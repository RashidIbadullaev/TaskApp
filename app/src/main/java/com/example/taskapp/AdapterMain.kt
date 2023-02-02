package com.example.taskapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.taskapp.databinding.RvItemBinding

class AdapterMain: RecyclerView.Adapter<AdapterMain.ViewHolder>() {
    inner class ViewHolder(private val binding: RvItemBinding ):
    RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RvItemBinding.inflate(LayoutInflater.from(parent.context), parent,
                false)
        )
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}