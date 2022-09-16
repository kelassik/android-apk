package com.konexus.classroom.modeldata

class ModelTaskCompleteTeacher2 {

    var img_student: Int = 0
        get() =field
        set(value) {field=value}

    var namaStudent: String = "Nama"
        get() = field
        set(value) {field=value}

    var namaPelajaran: String = "Pelajaran"
        get() = field
        set(value) {field=value}

    var namaClass : String = "Kelas"
        get() = field
        set(value) {field=value}

    constructor(img_student: Int, namaStudent: String, namaPelajaran: String,  namaClass: String) {
        this.img_student = img_student
        this.namaStudent = namaStudent
        this.namaPelajaran = namaPelajaran
        this.namaClass = namaClass
    }
}