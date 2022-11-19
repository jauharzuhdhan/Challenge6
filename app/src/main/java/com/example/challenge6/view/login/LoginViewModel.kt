package com.example.challenge6.view.login

import androidx.lifecycle.*
import com.example.challenge6.data.datastore.DataStoreManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(val dataStoreManager: DataStoreManager): ViewModel() {
    fun statusLogin(isLogin: Boolean) {
        viewModelScope.launch {
            dataStoreManager.statusLogin(isLogin)
        }
    }

    fun getUsername(): LiveData<String> {
        return dataStoreManager.getUsername().asLiveData()
    }

    fun getPassword(): LiveData<String> {
        return dataStoreManager.getPassword().asLiveData()
    }

    fun getLoginStatus(): LiveData<Boolean> {
        return dataStoreManager.getLoginStatus().asLiveData()
    }
}