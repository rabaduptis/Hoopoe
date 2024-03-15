package com.root14.hoopoe.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.root14.hoopoe.data.model.Assets
import com.root14.hoopoe.data.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository) : ViewModel() {

    private val _assets = MutableLiveData<Assets>()
    fun getAssests(): LiveData<Assets> {
        viewModelScope.launch {
            mainRepository.getUsers().let {
                _assets.value = it
            }
        }
        return _assets
    }

}