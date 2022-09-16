package com.konexus.classroom.modeldata

class ModelDataTask {

    var judulTask : String = "Judul Task"
        get() = field
        set(value) {field=value}

    var CalTask : String = "Calender Task"
        get() = field
        set(value) {field=value}

    var TimeTask : String = "Time Task"
        get() = field
        set(value) {field=value}

    constructor(judulTask: String, CalTask: String, TimeTask: String) {
        this.judulTask = judulTask
        this.CalTask = CalTask
        this.TimeTask = TimeTask
    }

    override fun toString(): String {
        return "ModelDataTask(judulTask='$judulTask'," +
                "CalTask='$CalTask', TimeTask=$TimeTask)"
    }
}