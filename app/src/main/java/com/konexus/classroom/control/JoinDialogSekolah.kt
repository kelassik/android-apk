package com.konexus.classroom.control

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.konexus.classroom.R
import com.konexus.classroom.activity.BarcodeActivity
import com.konexus.classroom.activity.MainActivity
import com.konexus.classroom.fragment.HomeFragment

class JoinDialogSekolah : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog!!.window?.setBackgroundDrawableResource(android.R.color.transparent)
        return inflater.inflate(R.layout.alert_dialog_join,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val join : Button = view.findViewById(R.id.joinclass)
        val cancel : Button = view.findViewById(R.id.cancelkelas)
        val name : EditText = view.findViewById(R.id.edclass)
        val room : EditText = view.findViewById(R.id.edclass1)

        cancel.setOnClickListener(View.OnClickListener {
            dialog!!.dismiss()
        })
        room.addTextChangedListener(object : TextWatcher
        {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {  }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val key : Int = 12345678
                var get : String = room.text.toString()
                val macth : Int = get.toInt()

                join.setOnClickListener(View.OnClickListener {
                    if (macth.equals(key)){
                        when(requireActivity().localClassName){
                            "activity.BarcodeActivity" -> startMainActivity()
                            "activity.MainActivity" -> replaceFragment()
                        }
                    }else{
                        Toast.makeText(requireActivity(),"Input ID Classroom Wrong", Toast.LENGTH_SHORT).show()
                    }

                })
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    override fun onStart() {
        super.onStart()
    }

    fun startMainActivity(){
        val intent = Intent(requireActivity(),MainActivity::class.java)
        intent.putExtra("THIS",requireActivity().localClassName)
        startActivity(intent)
        requireActivity().finish()
    }

    fun replaceFragment(){
        val fragmentManager = requireActivity().supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container,HomeFragment())
        fragmentTransaction.commit()
        dialog!!.dismiss()
    }
}