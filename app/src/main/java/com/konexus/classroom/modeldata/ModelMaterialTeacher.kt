package com.konexus.classroom.modeldata

class ModelMaterialTeacher {

    var nameMaterialTeacher : String = "Nama Teacher"
        get() = field
        set(value) {field=value}

    var imageMaterialTeacher : Int = 0
        get() = field
        set(value) {field=value}

    var lesMaterial : String = "Lesson"
        get() = field
        set(value) {field=value}

    var imageTimeMaterial : Int = 0
        get() = field
        set(value) {field=value}

    var tglMaterial : String = "Tanggal"
        get() = field
        set(value) {field=value}

    var listMaterial : ArrayList<ModelSubMaterialTeacher>?
        get() = field
        set(value) {field=value}

    var expandViewMaterial : Boolean = false
        get() = field
        set(value) {field=value}

    constructor(nameTeacherMaterial: String, imageTeacherMaterial: Int, lesMaterial: String, imageTimeMaterial:Int, tglMaterial: String, listMaterial: ArrayList<ModelSubMaterialTeacher>?,expandViewMaterial : Boolean) {
        this.nameMaterialTeacher = nameTeacherMaterial
        this.imageMaterialTeacher = imageTeacherMaterial
        this.lesMaterial = lesMaterial
        this.imageTimeMaterial = imageTimeMaterial
        this.tglMaterial = tglMaterial
        this.listMaterial = listMaterial
        this.expandViewMaterial = expandViewMaterial
    }

    override fun toString(): String {
        return "ModelMaterialTeacher(nameMaterialTeacher='$nameMaterialTeacher', imageMaterialTeacher=$imageMaterialTeacher, lesMaterial=$lesMaterial, imageTimeMaterial=$imageTimeMaterial, tglMaterial=$tglMaterial)"
    }
}