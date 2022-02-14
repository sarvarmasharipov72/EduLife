package sarvarmasharipov72.edulife

import android.content.ClipData
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel() : ViewModel(){
    var itemSelectedListener = MutableLiveData<Int>()
    fun itemClick(click: Int){
        itemSelectedListener.value = click
    }
}