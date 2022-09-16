package com.konexus.classroom.modeldata

class ModelDataTaskStudent {

    var imgStudent : Int = 0
        get() = field
        set(value) {field=value}

    var namaStudent : String = "Nama Student"
        get() = field
        set(value) {field=value}

    var taskStudent : String = "Task Student"
        get() = field
        set(value) {field=value}

    constructor(imgStudent: Int, namaStudent: String, taskStudent: String) {
        this.imgStudent = imgStudent
        this.namaStudent = namaStudent
        this.taskStudent = taskStudent
    }

    override fun toString(): String {
        return "ModelDataTaskStudent(imgStudent='$imgStudent'," +
                "namaStudent='$namaStudent', taskStudent=$taskStudent)"
    }
}