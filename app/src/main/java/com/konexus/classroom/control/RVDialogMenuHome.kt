package com.konexus.classroom.control

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.konexus.classroom.R
import com.konexus.classroom.activity.*

class RVDialogMenuHome : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog!!.window?.setBackgroundDrawableResource(android.R.color.transparent)
        return inflater.inflate(R.layout.menu_home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnAssig : Button = view.findViewById(R.id.btn_menu_assi)
        val btnDiscus : Button = view.findViewById(R.id.btn_menu_discus)
        val btnMateri : Button = view.findViewById(R.id.btn_menu_material)
        val btnTes : Button = view.findViewById(R.id.btn_tes_teacher)

        btnAssig.setOnClickListener {

            val intent = Intent(requireActivity(), TaskHistoryActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }

        btnDiscus.setOnClickListener {

            val intent = Intent(requireActivity(), DiscussionBoardActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }
        btnMateri.setOnClickListener {

            val intent = Intent(requireActivity(), MaterialActivityTeacher::class.java)
            startActivity(intent)
            requireActivity().finish()
        }
        btnTes.setOnClickListener {

            val intent = Intent(requireActivity(), SecheduleTeacherActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }
    }

    override fun onStart() {
        super.onStart()
        val width = (resources.displayMetrics.widthPixels * 1)
        dialog!!.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
        }
    }