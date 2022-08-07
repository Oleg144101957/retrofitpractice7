package com.vishnevskiypro.retrofitpractice7.screens.first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishnevskiypro.retrofitpractice7.data.repository.Repository
import com.vishnevskiypro.retrofitpractice7.models.nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class FirstViewModel : ViewModel() {

    val repo = Repository()
    val myNalLiveData : MutableLiveData<Response<Nalichka>> = MutableLiveData()

    fun getNalichkaForViewModel(){
        viewModelScope.launch {
            myNalLiveData.value = repo.getNalRepo()
        }
    }

}