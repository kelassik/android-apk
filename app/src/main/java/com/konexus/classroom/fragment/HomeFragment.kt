package com.konexus.classroom.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.RelativeLayout
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.konexus.classroom.R
import com.konexus.classroom.activity.ScheduleBoardActivity
import com.konexus.classroom.adapter.AdapterRecyclerViewHome


class HomeFragment : Fragment(R.layout.fragment_home){

    private lateinit var list: ArrayList<Int>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recy : RecyclerView = view.findViewById(R.id.rv_home)
        val relViewScedule : RelativeLayout = view.findViewById(R.id.rel2)

        var list: ArrayList<Int> = ArrayList<Int>()

        list.add(R.drawable.sport)
        list.add(R.drawable.sains)
        list.add(R.drawable.sains2)
        list.add(R.drawable.english)
        list.add(R.drawable.bahasa)
        list.add(R.drawable.music)
        list.add(R.drawable.math)
        list.add(R.drawable.fisik)
        list.add(R.drawable.computer)
        list.add(R.drawable.sosial)
        list.add(R.drawable.art)
        list.add(R.drawable.history)
        list.add(R.drawable.religius)

        val suportFrag : FragmentManager = requireActivity().supportFragmentManager
        val adapter = AdapterRecyclerViewHome(suportFrag ,list)
        recy.layoutManager = GridLayoutManager(activity,3, GridLayoutManager.HORIZONTAL,false)
        recy.adapter = adapter

        relViewScedule.setOnClickListener(View.OnClickListener {
            val intent = Intent(requireActivity(), ScheduleBoardActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        })
    }

}