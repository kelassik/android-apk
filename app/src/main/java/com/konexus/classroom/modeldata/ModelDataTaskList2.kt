package com.konexus.classroom.modeldata

class ModelDataTaskList2 {

    var namaMateri : String? = "Nama Materi"
        get() = field
        set(value) {field=value}

    var namaStatus : String = "Status Task"
        get() = field
        set(value) {field=value}

    constructor(namaMateri: String?, namaStatus: String) {
        this.namaMateri = namaMateri
        this.namaStatus = namaStatus
    }

    override fun toString(): String {
        return "ModelDataTaskList2(namaMateri='$namaMateri',"+ "namaStatus=$namaStatus)"
    }
}