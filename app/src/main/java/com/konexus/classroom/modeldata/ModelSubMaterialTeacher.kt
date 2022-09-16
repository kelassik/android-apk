package com.konexus.classroom.modeldata

class ModelSubMaterialTeacher {

    var nameMaterialDownload : String = "Nama Download"
        get() = field
        set(value) {field=value}

    var imgMaterialDownload : Int = 0
        get() = field
        set(value) {field=value}

    var nameMaterialView : String = "Nama View"
        get() = field
        set(value) {field=value}

    var imgMaterialView : Int = 0
        get() = field
        set(value) {field=value}

    var linkMaterial : String = "Lesson"
        get() = field
        set(value) {field=value}

    constructor(nameMaterialDownload: String, imgMaterialDownload: Int, linkMaterial: String, nameMaterialView: String, imgMaterialView: Int) {
        this.nameMaterialDownload = nameMaterialDownload
        this.imgMaterialDownload = imgMaterialDownload
        this.linkMaterial = linkMaterial
        this.nameMaterialView = nameMaterialView
        this.imgMaterialView = imgMaterialView
    }
}