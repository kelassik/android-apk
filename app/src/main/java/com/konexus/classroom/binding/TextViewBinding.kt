package com.konexus.classroom.binding

import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.databinding.BindingAdapter
import com.konexus.classroom.R

@BindingAdapter("setBackground")
fun TextView.setBackground(isEnabled: Boolean) {
    if (isEnabled) {
        background = AppCompatResources.getDrawable(context, R.drawable.bg_switch_login_active)
    } else {
        setBackgroundResource(0)
    }
}