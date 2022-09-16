package com.konexus.classroom.modeldata

import android.graphics.Bitmap

class ModelDataDiscussion {

    var disjudul : String = "Judul Post"
        get() = field
        set(value) {field=value}

    var timepos : String = "Waktu Post"
        get() = field
        set(value) {field=value}

    var posti : String = "Posting"
        get() = field
        set(value) {field=value}

    var ppost : Bitmap?
        get() = field
        set(value) {field=value}


    constructor(disjudul: String, timepos: String, posti: String, ppost: Bitmap?) {

        this.disjudul = disjudul
        this.timepos = timepos
        this.posti = posti
        this.ppost = ppost
    }


    override fun toString(): String {
        return "ModelDataDiscussion(disjudul='$disjudul', ," +
                "timepos=$timepos, posti='$posti', ppost='$ppost')"
    }
}