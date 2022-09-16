package com.konexus.classroom.ui.auth.otp

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import com.konexus.classroom.R
import com.konexus.classroom.databinding.ActivityOtpBinding

class OtpActivity : AppCompatActivity() {

    private lateinit var otpActivityBinding: ActivityOtpBinding
    private val otpViewModel: OtpViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        otpActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_otp)

        otpActivityBinding.apply {
            lifecycleOwner = this@OtpActivity
            viewModel = otpViewModel
        }

        val iMethodManager =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        otpActivityBinding.apply {
            etOtp1.addTextChangedListener { it?.changeFocus(etOtp2) }
            etOtp2.addTextChangedListener { it?.changeFocus(etOtp3, etOtp1) }
            etOtp3.addTextChangedListener { it?.changeFocus(etOtp4, etOtp2) }
            etOtp4.addTextChangedListener {
                if (!it.isNullOrEmpty()) {
                    iMethodManager.hideSoftInputFromWindow(etOtp4.windowToken, 0)
                    etOtp4.clearFocus()
                    otpViewModel.checkOtp()
                }
            }
        }

        otpViewModel.action.observe(this, { action ->
            when (action) {
                OtpViewModel.ACTION_OTP_SUCCESS -> onOtpSuccess()
                OtpViewModel.ACTION_OTP_FAILED -> onOtpFailed()
            }
        })

        // Auto Focus on First OTP EditText
        iMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0)
        otpActivityBinding.etOtp1.requestFocus()
    }

    private fun onOtpFailed() {
        Toast.makeText(this, "OTP Code is wrong!", Toast.LENGTH_SHORT).show()
    }

    private fun onOtpSuccess() {
        Toast.makeText(this, "Success to validate OTP", Toast.LENGTH_SHORT).show()
        finish()
    }

    private fun Editable.changeFocus(destination: EditText, lastPosition: Boolean = false) {
        if (this.isNotEmpty() && !lastPosition) destination.requestFocus()
        else if (this.isEmpty() && lastPosition) destination.requestFocus()

    }

    private fun Editable.changeFocus(next: EditText, previous: EditText) {
        if (this.isNotEmpty()) next.requestFocus()
        else if (this.isEmpty()) previous.requestFocus()
    }

}