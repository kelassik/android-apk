package com.konexus.classroom.ui.auth.register

import com.konexus.classroom.ui.BaseViewModel

class RegisterEmailViewModel : BaseViewModel() {

    companion object {
        const val ACTION_REGISTER_BACK_CLICK = "action_register_back_click"
    }

    fun backOnClick() {
        action.value = ACTION_REGISTER_BACK_CLICK
    }

}