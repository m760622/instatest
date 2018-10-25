package se.nmds.instatest.screen.feed

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import se.nmds.instatest.R
import se.nmds.instatest.data.Post
import se.nmds.instatest.databinding.PostItemBinding

class PostViewHolder(val binding: PostItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(post: Post) {
        binding.post = post
    }

    companion object {
        fun newInstance(parent: ViewGroup): PostViewHolder {
            return PostViewHolder(
                DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.post_item,
                    parent,
                    false
                )
            )
        }
    }
}