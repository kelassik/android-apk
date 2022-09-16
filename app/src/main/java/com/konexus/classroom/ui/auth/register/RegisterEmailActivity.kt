package com.konexus.classroom.ui.auth.register

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.konexus.classroom.R
import com.konexus.classroom.databinding.ActivityRegisterEmailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterEmailActivity : AppCompatActivity() {

    private lateinit var registerEmailBinding: ActivityRegisterEmailBinding
    private val registerEmailViewModel: RegisterEmailViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerEmailBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_register_email)

        registerEmailBinding.apply {
            lifecycleOwner = this@RegisterEmailActivity
            viewModel = registerEmailViewModel
        }

        registerEmailViewModel.action.observe(this, { action ->
            when (action) {
                RegisterEmailViewModel.ACTION_REGISTER_BACK_CLICK -> backButtonOnClick()
            }
        })
    }

    private fun backButtonOnClick() {
        finish()
    }

}