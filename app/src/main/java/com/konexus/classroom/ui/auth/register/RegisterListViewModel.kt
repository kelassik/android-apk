package com.konexus.classroom.ui.auth.register

import com.konexus.classroom.ui.BaseViewModel

class RegisterListViewModel : BaseViewModel() {

    companion object {
        const val ACTION_REGISTERLIST_SIGNIN_CLICK = "action_registerlist_signin_click"
        const val ACTION_REGISTERLIST_EMAIL_CLICK = "action_registerlist_email_click"
        const val ACTION_REGISTERLIST_PHONE_CLICK = "action_registerlist_phone_click"
    }

    fun signInOnClick() {
        action.value = ACTION_REGISTERLIST_SIGNIN_CLICK
    }

    fun registerEmailOnClick() {
        action.value = ACTION_REGISTERLIST_EMAIL_CLICK
    }

    fun registerPhoneOnClick() {
        action.value = ACTION_REGISTERLIST_PHONE_CLICK
    }

}