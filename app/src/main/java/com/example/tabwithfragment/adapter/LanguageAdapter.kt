package com.example.tabwithfragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.tabwithfragment.R
import com.example.tabwithfragment.model.Language

class LanguageAdapter : ListAdapter<Language, LanguageAdapter.LanguageViewHolder>(DiffCallBack()) {
    private class DiffCallBack : DiffUtil.ItemCallback<Language>() {
        override fun areItemsTheSame(oldItem: Language, newItem: Language): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Language, newItem: Language): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_language, parent, false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class LanguageViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(language: Language) {
            with(view) {
                val textView: TextView = findViewById(R.id.textView)
                val imageView: ImageView = findViewById(R.id.imageView)
                imageView.setImageResource(language.icon)
                textView.text = language.name
            }
        }
    }
}