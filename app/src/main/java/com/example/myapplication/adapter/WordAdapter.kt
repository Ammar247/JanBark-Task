package com.example.task.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ListWordBinding

class WordAdapter(
    private val clickListener: (String) -> Unit
) : ListAdapter<String, WordViewHolder>(WordCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        return WordViewHolder(
            ListWordBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            clickListener,
        )
    }

    override fun onBindViewHolder(viewholder: WordViewHolder, pos: Int) {
        viewholder.bind(getItem(pos))
    }

    override fun getItemId(pos: Int): Long {
        return getItem(pos).hashCode().toLong()
    }

}

class WordCallback : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}

class WordAdapterViewModel(wordTitle: String) {

    val title = wordTitle

}

class WordViewHolder(
    private val binding: ListWordBinding,
    private val clickListener: (String) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(title: String) {
        binding.viewModel = WordAdapterViewModel(title)
        binding.executePendingBindings()
        binding.root.setOnClickListener {
            clickListener(title)
        }
    }
}