package com.konexus.classroom.modeldata

class ModelTaskCompleteTeacher {

    var lessonTask: String = "Pelajaran"
        get() = field
        set(value) {field=value}

    var lessonStatus : String = "Lesson"
        get() = field
        set(value) {field=value}

    constructor(lessonTask: String,  lessonStatus: String) {
        this.lessonTask = lessonTask
        this.lessonStatus = lessonStatus
    }
}