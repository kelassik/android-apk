package com.konexus.classroom.modeldata

import android.graphics.Bitmap

class ModelSubMaterial {

    var nameMaterial : String = "Nama"
        get() = field
        set(value) {field=value}

    var imgMat : Int = 0
        get() = field
        set(value) {field=value}

    var linkMaterial : String = "Lesson"
        get() = field
        set(value) {field=value}

    constructor(nameMaterial: String, imgMat: Int, linkMaterial: String) {
        this.nameMaterial = nameMaterial
        this.imgMat = imgMat
        this.linkMaterial = linkMaterial
    }
}