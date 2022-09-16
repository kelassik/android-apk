package com.konexus.classroom.control

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.konexus.classroom.R

class DialogUploadMateri : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog!!.window?.setGravity(Gravity.CENTER  )
        dialog!!.window?.setBackgroundDrawableResource(android.R.color.transparent)
        return inflater.inflate(R.layout.dialog_upload_materi,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnClass4 : Button = view.findViewById(R.id.btnxii4)
        val btnClass2 : Button = view.findViewById(R.id.btnxii2)
        val btnClass1 : Button = view.findViewById(R.id.btnxii1)
        val btnClass3 : Button = view.findViewById(R.id.btnxii3)

    }

    override fun onStart() {
        super.onStart()
        val width = (resources.displayMetrics.widthPixels * 1)
        dialog!!.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
    }
}