package se.nmds.instatest.data

import com.google.firebase.Timestamp


data class Post(var name: String = "", var url: String = "", var timestamp: Timestamp? = null)