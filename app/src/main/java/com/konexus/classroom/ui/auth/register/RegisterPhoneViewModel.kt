package com.konexus.classroom.ui.auth.register

import com.konexus.classroom.ui.BaseViewModel

class RegisterPhoneViewModel : BaseViewModel() {

    companion object {
        const val ACTION_REGISTER_PHONE_BACK_ON_CLICK = "action_register_phone_back_on_click"
    }

    fun backOnClick() {
        action.value = ACTION_REGISTER_PHONE_BACK_ON_CLICK
    }

}