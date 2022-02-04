package ivanavicius.robertas.viewmodel.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import ivanavicius.robertas.api.endpoints.Home
import ivanavicius.robertas.model.home.EpisodesModel
import kotlinx.coroutines.launch

class EpisodesViewModel(application: Application): AndroidViewModel(application) {

    private var _model: MutableLiveData<EpisodesModel> = MutableLiveData()
    val model: LiveData<EpisodesModel> get() = _model

    fun getData() {
        viewModelScope.launch {
            _model.value = EpisodesModel(Home.getSeasons(getApplication<Application>().baseContext))
        }
    }

}