package com.konexus.classroom.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {

    val loadingEnabled = MutableLiveData<Boolean>()
    val action = MutableLiveData<String>()

}