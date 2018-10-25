package se.nmds.instatest.utils

import android.databinding.BindingAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import java.text.SimpleDateFormat
import com.google.firebase.Timestamp
import java.util.*

@BindingAdapter("imageUrl")
fun setImageUrl(view: ImageView, url: String) {
    Glide.with(view.context).load(url).into(view)
}

val sfd = SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.getDefault());
val dateStr = sfd.format(Timestamp.now().toDate())

@BindingAdapter("textTimestamp")
fun setTimestamp(view: TextView, value: Timestamp?) {
    value?.let {
        val sfd = SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.getDefault());
        view.text = sfd.format(value.toDate())

        println(sfd.format(value.toDate()))
    }
}


/*

@BindingAdapter("textTimestamp")
fun setTimestamp(view: TextView, value: Timestamp) {
  val sfd = SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.getDefault());
  view.text = sfd.format(value.toDate())
}

@BindingAdapter("textTimestamp")
fun setTimestamp(view: TextView, value: Timestamp) {
    view.text = value.toString()
}
*/