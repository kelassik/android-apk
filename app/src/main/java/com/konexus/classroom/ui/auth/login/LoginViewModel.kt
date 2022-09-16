package com.konexus.classroom.ui.auth.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.konexus.classroom.ui.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoginViewModel : BaseViewModel() {

    companion object {
        const val ACTION_LOGIN_SIGNUP_CLICK = "action_login_signup"
        const val ACTION_LOGIN_EMAIL_SUCCESS = "action_login_email_success"
        const val ACTION_LOGIN_PHONE_SUCCESS = "action_login_phone_success"
    }

    val isEmailTabActive = MutableLiveData<Boolean>()
    val isPhoneTabActive = MutableLiveData<Boolean>()

    val emailEditText = MutableLiveData<String>()
    val passwordEditText = MutableLiveData<String>()

    init {
        isEmailTabActive.value = true
        isPhoneTabActive.value = false
    }

    fun emailTabOnClick() {
        isEmailTabActive.value = true
        isPhoneTabActive.value = false
    }

    fun phoneTabOnClick() {
        isEmailTabActive.value = false
        isPhoneTabActive.value = true
    }

    fun signUpOnClick() {
        action.value = ACTION_LOGIN_SIGNUP_CLICK
    }

    fun loginButtonOnClick() {
        loadingEnabled.value = true
        viewModelScope.launch {
            delay(1500L)
            loadingEnabled.postValue(false)

            if (isEmailTabActive.value == true) {
                action.postValue(ACTION_LOGIN_EMAIL_SUCCESS)
            } else if (isPhoneTabActive.value == true) {
                action.postValue(ACTION_LOGIN_PHONE_SUCCESS)
            }
        }
    }

}