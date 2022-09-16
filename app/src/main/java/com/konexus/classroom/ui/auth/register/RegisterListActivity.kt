package com.konexus.classroom.ui.auth.register

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.konexus.classroom.R
import com.konexus.classroom.databinding.ActivityRegisterListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterListActivity : AppCompatActivity() {

    private lateinit var registerListActivityBinding: ActivityRegisterListBinding
    private val registerListViewModel: RegisterListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerListActivityBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_register_list)

        registerListActivityBinding.apply {
            lifecycleOwner = this@RegisterListActivity
            viewModel = registerListViewModel
        }

        registerListViewModel.action.observe(this, { action ->
            when (action) {
                RegisterListViewModel.ACTION_REGISTERLIST_SIGNIN_CLICK -> signInOnClick()
                RegisterListViewModel.ACTION_REGISTERLIST_EMAIL_CLICK -> emailButtonOnClick()
                RegisterListViewModel.ACTION_REGISTERLIST_PHONE_CLICK -> phoneButtonOnClick()
            }
        })
    }

    private fun phoneButtonOnClick() {
        startActivity(Intent(this, RegisterPhoneActivity::class.java))
    }

    private fun emailButtonOnClick() {
        startActivity(Intent(this, RegisterEmailActivity::class.java))
    }

    private fun signInOnClick() {
        finish()
    }

}