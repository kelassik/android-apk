package com.konexus.classroom.ui.main.classmenu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.konexus.classroom.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ClassFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_classmenu, container, false)
    }
}