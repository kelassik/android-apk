package com.konexus.classroom.modeldata

import android.graphics.Bitmap

class ModelDataMateri {

    var nameTeacher : String = "Nama Teacher"
        get() = field
        set(value) {field=value}

    var imageTeacher : Int = 0
        get() = field
        set(value) {field=value}

    var les : String = "Lesson"
        get() = field
        set(value) {field=value}

    var imageTime : Int = 0
        get() = field
        set(value) {field=value}

    var tgl : String = "Tanggal"
        get() = field
        set(value) {field=value}

    var list : ArrayList<ModelSubMaterial>?
        get() = field
        set(value) {field=value}

    var expandView : Boolean = false
        get() = field
        set(value) {field=value}

    constructor(nameTeacher: String, imageTeacher: Int, les: String, imageTime:Int, tgl: String, list: ArrayList<ModelSubMaterial>?,expandView : Boolean) {
        this.nameTeacher = nameTeacher
        this.imageTeacher = imageTeacher
        this.les = les
        this.imageTime = imageTime
        this.tgl = tgl
        this.list = list
        this.expandView = expandView
    }

    override fun toString(): String {
        return "ModelDataMateri(nameTeacher='$nameTeacher', imageTeacher=$imageTeacher, les=$les, imageTime=$imageTime, tgl=$tgl)"
    }
}