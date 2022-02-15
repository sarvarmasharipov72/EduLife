package sarvarmasharipov72.edulife.ui.Home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {
    var item = MutableLiveData<Boolean>()

    fun itemSelected(click: Boolean) {
        item.value = click
    }
}