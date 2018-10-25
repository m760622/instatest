package se.nmds.instatest.utils

import android.databinding.BindingAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import java.sql.Timestamp

@BindingAdapter("imageUrl")
fun setImageUrl(view: ImageView, url: String) {
    Glide.with(view.context).load(url).into(view)
}


@BindingAdapter("textTimestamp")
fun setTimestamp(view: TextView, value: Timestamp) {
    view.text = value.toString()
}
