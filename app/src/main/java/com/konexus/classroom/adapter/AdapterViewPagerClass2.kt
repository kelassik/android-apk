package com.konexus.classroom.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.PagerAdapter
import com.konexus.classroom.R
import com.konexus.classroom.activity.EventActivity

class AdapterViewPagerClass2 (var cont: Context,
                              var data: ArrayList<Int>)
    : PagerAdapter()
    {
    private lateinit var layoutInflater : LayoutInflater

    override fun getCount(): Int {
        return data.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view.equals(`object`)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = LayoutInflater.from(cont)
        var view = layoutInflater.inflate(R.layout.item_vp_class2,container,false)

        var imageClass = view.findViewById<ImageView>(R.id.imgvpclass2)
        container.addView(view,0)

        if (!data.isEmpty()){
            imageClass.setImageResource(data.get(position))
        }else{
            imageClass.setImageResource(R.drawable.no_image)
        }

        view.setOnClickListener(View.OnClickListener {
            cont.startActivity(Intent(cont, EventActivity::class.java))
        })

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}