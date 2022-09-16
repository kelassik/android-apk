package com.konexus.classroom.modeldata

class ModelOngoingAssigTeacher {

    var imgOngoing : Int = 0
        get() = field
        set(value) {field=value}

    var nameOngoing: String = "Nama"
        get() = field
        set(value) {field=value}

    var lessonOngoing : String = "Lesson"
        get() = field
        set(value) {field=value}

    constructor(imgOngoing: Int, nameOngoing: String,  lessonOngoing: String) {
        this.imgOngoing = imgOngoing
        this.nameOngoing = nameOngoing
        this.lessonOngoing = lessonOngoing
    }
}