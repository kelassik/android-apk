package com.konexus.classroom.modeldata

class ModelTaskCompleteTeacher4 {

    var img_student4 : Int = 0
        get() =field
        set(value) {field=value}

    var namaStudent4 : String = "Nama"
        get() = field
        set(value) {field=value}

    var namaPelajaran4 : String = "Pelajaran"
        get() = field
        set(value) {field=value}

    var namaClass4 : String = "Kelas"
        get() = field
        set(value) {field=value}
    constructor(img_student4: Int, namaStudent4: String, namaPelajaran4: String,  namaClass4: String) {
        this.img_student4 = img_student4
        this.namaStudent4 = namaStudent4
        this.namaPelajaran4 = namaPelajaran4
        this.namaClass4 = namaClass4
    }
}