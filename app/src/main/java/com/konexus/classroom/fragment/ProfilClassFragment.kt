package com.konexus.classroom.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.konexus.classroom.R
import com.konexus.classroom.activity.EventActivity
import com.konexus.classroom.adapter.AdapterRecyclerViewClass
import com.konexus.classroom.adapter.AdapterViewPagerClass
import com.konexus.classroom.adapter.AdapterViewPagerClass2
import com.konexus.classroom.modeldata.ModelDataRecycleClass

class ProfilClassFragment : Fragment(R.layout.fragment_profil_class) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val context : Context = requireActivity()

        val viewPager : ViewPager = view.findViewById(R.id.vpclass)
        val viewPager2 : ViewPager = view.findViewById(R.id.vpclass2)
        val listClass : RecyclerView = view.findViewById(R.id.rcclass)

        //set-View, Adapter & Data ViewPager
        var listVPup : ArrayList<Int> = ArrayList()
        listVPup.add(R.drawable.no_image)
        listVPup.add(R.drawable.no_image)
        listVPup.add(R.drawable.no_image)

        val adapterViewP = AdapterViewPagerClass(context, listVPup)
        viewPager.adapter = adapterViewP

        var listVPclass2 : ArrayList<Int> = ArrayList()
        listVPclass2.add(R.drawable.school)
        listVPclass2.add(R.drawable.festivalmusic)
        listVPclass2.add(R.drawable.school)
        listVPclass2.add(R.drawable.festivalmusic)

        val adapterViewP2 = AdapterViewPagerClass2(context, listVPclass2)
        viewPager2.adapter = adapterViewP2

        //set-View, Adapter & Data RecyclerView
        var list: ArrayList<ModelDataRecycleClass> = ArrayList()
        list.add(ModelDataRecycleClass(
            "XII IPA",
            "1",
            25,
            "Yopa S., S.Kom."))
        list.add(ModelDataRecycleClass(
            "XII IPS",
            "2",
            20,
            "Kevin S., S.Kom."))
        list.add(ModelDataRecycleClass(
            "XII BHS",
            "2",
            20,
            "Fatur S., S.Kom."))

        val adapterRecyc = AdapterRecyclerViewClass(requireActivity().supportFragmentManager,list)
        listClass.layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        listClass.adapter = adapterRecyc


    }
}