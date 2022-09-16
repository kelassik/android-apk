package com.konexus.classroom.modeldata

import android.graphics.Bitmap
import android.widget.ImageView

class ModelDiscussTeacher {

    var disjudul : String = "Judul Post"
        get() = field
        set(value) {field=value}

    var timepos : String = "Waktu Post"
        get() = field
        set(value) {field=value}

    var posti : String = "Posting"
        get() = field
        set(value) {field=value}

    var ppost : Int = 0
        get() = field
        set(value) {field=value}


    constructor(disjudul: String, timepos: String, posti: String, ppost: Int) {

        this.disjudul = disjudul
        this.timepos = timepos
        this.posti = posti
        this.ppost = ppost
    }


    override fun toString(): String {
        return "ModelDiscussTeacher(disjudul='$disjudul', ," +
                "timepos=$timepos, posti='$posti', ppost='$ppost')"
    }
}