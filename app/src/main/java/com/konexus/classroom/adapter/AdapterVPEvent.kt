package com.konexus.classroom.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.konexus.classroom.R
import com.konexus.classroom.activity.EventActivity2

class AdapterVPEvent (var context: Context,
                      var data: ArrayList<Int>)
    : PagerAdapter() {
    private lateinit var layoutInflater : LayoutInflater

    override fun getCount(): Int {
        return data.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view.equals(`object`)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = LayoutInflater.from(context)
        var view = layoutInflater.inflate(R.layout.item_vp_event,container,false)

        var imageClass = view.findViewById<ImageView>(R.id.img_vp_event)
        container.addView(view,0)

        Log.e("DATA LIST",""+data.toString())

        if (!data.isEmpty()){
            imageClass.setImageResource(data.get(position))
        }else{
            imageClass.setImageResource(R.mipmap.noimage_img)
        }

        view.setOnClickListener(View.OnClickListener {
            var intent = Intent(context,EventActivity2::class.java)
            intent.putExtra("EVENTIMAGE",imageClass.imageAlpha)
            context.startActivity(intent)
        })

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}