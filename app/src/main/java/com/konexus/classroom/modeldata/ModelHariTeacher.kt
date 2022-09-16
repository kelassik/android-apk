package com.konexus.classroom.modeldata

class ModelHariTeacher {

    var hari : String = "Judul Task"
        get() = field
        set(value) {field=value}

    var scedule : ArrayList<ModelScheduleTeacher> = ArrayList()
        get() = field
        set(value) {field=value}

    constructor(hari: String, sceduleTeacher: ArrayList<ModelScheduleTeacher>){
        this.hari = hari
        this.scedule = sceduleTeacher
    }

    override fun toString(): String {
        return "ModelHariTeacher(hari='$hari', scedule=$scedule)"
    }
}