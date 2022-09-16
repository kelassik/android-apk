package com.konexus.classroom.binding

import android.widget.EditText
import androidx.appcompat.content.res.AppCompatResources
import androidx.databinding.BindingAdapter
import com.konexus.classroom.R

@BindingAdapter("setInputTextBg")
fun EditText.setBackgroundInputText(text: String) {
    background = if (text == "") {
        AppCompatResources.getDrawable(this.context, R.drawable.bg_textinput_otp_empty)
    } else {
        AppCompatResources.getDrawable(this.context, R.drawable.bg_textinput_otp_filled)
    }
}

@BindingAdapter("setInputType")
fun EditText.setInputType(isLoading: Boolean) {
    isEnabled = !isLoading
}