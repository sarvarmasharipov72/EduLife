package sarvarmasharipov72.edulife.ui.Home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {
    var itemCourses = MutableLiveData<Boolean>()
    var itemReyting = MutableLiveData<Boolean>()

    fun itemSelectedCourses(click: Boolean) {
        itemCourses.value = click
    }

    fun itemSelectedReyting(click: Boolean) {
        itemReyting.value = click
    }
}