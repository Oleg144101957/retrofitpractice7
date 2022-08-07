package com.vishnevskiypro.retrofitpractice7.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishnevskiypro.retrofitpractice7.data.repository.Repository
import com.vishnevskiypro.retrofitpractice7.models.beznal.Beznalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel : ViewModel() {

    val repo = Repository()
    val myBeznalLiveData: MutableLiveData<Response<Beznalichka>> = MutableLiveData()

    fun getBeznalForViewModel(){
        viewModelScope.launch {
            myBeznalLiveData.value = repo.getBeznal()
        }
    }

}