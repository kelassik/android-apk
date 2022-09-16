package com.konexus.classroom.ui.auth.otp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.konexus.classroom.ui.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class OtpViewModel : BaseViewModel() {

    companion object {
        const val ACTION_OTP_SUCCESS = "action_otp_success"
        const val ACTION_OTP_FAILED = "action_otp_failed"
    }

    val editTextOtp1 = MutableLiveData<String>()
    val editTextOtp2 = MutableLiveData<String>()
    val editTextOtp3 = MutableLiveData<String>()
    val editTextOtp4 = MutableLiveData<String>()

    val isOtpSessionInvalid = MutableLiveData<Boolean>()

    init {
        editTextOtp1.value = ""
        editTextOtp2.value = ""
        editTextOtp3.value = ""
        editTextOtp4.value = ""
        loadingEnabled.value = false
    }

    fun checkOtp() {
        loadingEnabled.value = true
        isOtpSessionInvalid.value = true

        viewModelScope.launch {
            delay(1500L)

            val otpUserInput = getOtpValue()
            val otpServerCode = "5555"

            if (otpUserInput == otpServerCode) {
                action.postValue(ACTION_OTP_SUCCESS)
            } else {
                action.postValue(ACTION_OTP_FAILED)
            }

            loadingEnabled.postValue(false)
        }
    }

    fun getOtpValue(): String {
        return "${editTextOtp1.value}${editTextOtp2.value}${editTextOtp3.value}${editTextOtp4.value}"
    }

}