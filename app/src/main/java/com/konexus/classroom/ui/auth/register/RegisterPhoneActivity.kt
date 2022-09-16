package com.konexus.classroom.ui.auth.register

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.konexus.classroom.R
import com.konexus.classroom.databinding.ActivityRegisterPhoneBinding

class RegisterPhoneActivity : AppCompatActivity() {

    private lateinit var registerPhoneBinding: ActivityRegisterPhoneBinding
    private val registerPhoneViewModel: RegisterPhoneViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerPhoneBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_register_phone)

        registerPhoneBinding.apply {
            lifecycleOwner = this@RegisterPhoneActivity
            viewModel = registerPhoneViewModel
        }

        registerPhoneViewModel.action.observe(this, { action ->
            when (action) {
                RegisterPhoneViewModel.ACTION_REGISTER_PHONE_BACK_ON_CLICK -> backOnClick()
            }
        })
    }

    private fun backOnClick() {
        finish()
    }

}