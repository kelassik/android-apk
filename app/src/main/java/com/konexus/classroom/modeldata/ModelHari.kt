package com.konexus.classroom.modeldata

import com.konexus.classroom.modeldata.ModelScedule

class ModelHari {
    var hari : String = "Judul Task"
        get() = field
        set(value) {field=value}

    var scedule : ArrayList<ModelScedule> = ArrayList()
        get() = field
        set(value) {field=value}

    constructor(hari: String, scedule: ArrayList<ModelScedule>){
        this.hari = hari
        this.scedule = scedule
    }

    override fun toString(): String {
        return "ModelHari(hari='$hari', scedule=$scedule)"
    }


}