package se.nmds.instatest.screen.camera

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import se.nmds.instatest.data.PictureRepository
import se.nmds.instatestse.nmds.instatest.utils.SingleLiveEvent

class CameraViewModel(val pictureRepository: PictureRepository) : ViewModel() {

    val pictureSaved = MutableLiveData<String>()

    val takePicture = SingleLiveEvent<Boolean>()

    fun onTakePicture() {
        takePicture.value = true
    }

    fun savePicture(jpeg: ByteArray?) {
        jpeg?.let {
            pictureRepository.save(it) {
                pictureSaved.value = it.name
            }
        }
    }

}