package se.nmds.instatest.screen.camera

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.content.Context
import se.nmds.instatest.data.PictureRepository

class CameraViewModelFactory(val context: Context) : ViewModelProvider.Factory {

    val pictureRepository =  CameraViewModel(PictureRepository(context))

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return pictureRepository as T
    }
}