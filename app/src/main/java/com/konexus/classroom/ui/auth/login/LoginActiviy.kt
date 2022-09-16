package com.konexus.classroom.ui.auth.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.konexus.classroom.R
import com.konexus.classroom.activity.BarcodeActivity
import com.konexus.classroom.databinding.ActivityLoginBinding
import com.konexus.classroom.ui.auth.otp.OtpActivity
import com.konexus.classroom.ui.auth.register.RegisterListActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActiviy : AppCompatActivity() {

    private lateinit var loginActivityBinding: ActivityLoginBinding
    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        loginActivityBinding.apply {
            lifecycleOwner = this@LoginActiviy
            viewModel = loginViewModel
        }

        loginViewModel.action.observe(this, { action ->
            when (action) {
                LoginViewModel.ACTION_LOGIN_SIGNUP_CLICK -> signUpOnClick()
                LoginViewModel.ACTION_LOGIN_EMAIL_SUCCESS -> loginEmailSuccess()
                LoginViewModel.ACTION_LOGIN_PHONE_SUCCESS -> loginPhoneSuccess()
            }
        })
    }

    private fun loginPhoneSuccess() {
        startActivity(Intent(this, OtpActivity::class.java))
    }

    private fun loginEmailSuccess() {
        Toast.makeText(
            this,
            "Hello ${loginViewModel.emailEditText.value}! Login Success!",
            Toast.LENGTH_SHORT
        ).show()
        startActivity(Intent(this, BarcodeActivity::class.java))
        finish()
    }

    private fun signUpOnClick() {
        startActivity(Intent(this, RegisterListActivity::class.java))
    }

}