package com.konexus.classroom.modeldata

class ModelDataTaskList {

    var namaMurid : String = "Nama Murid"
        get() = field
        set(value) {field=value}

    var namaMateri : String = "Nama Materi"
        get() = field
        set(value) {field=value}

    var namaStatus : String = "Status Task"
        get() = field
        set(value) {field=value}

    constructor(namaMurid: String, namaMateri: String, namaStatus: String) {
        this.namaMurid = namaMurid
        this.namaMateri = namaMateri
        this.namaStatus = namaStatus
    }

    override fun toString(): String {
        return "ModelDataTaskList(namaMurid='$namaMurid'," +
                "namaMateri='$namaMateri', namaStatus=$namaStatus)"
    }
}