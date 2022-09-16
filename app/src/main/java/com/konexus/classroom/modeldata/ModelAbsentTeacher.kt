package com.konexus.classroom.modeldata

class ModelAbsentTeacher {

    var name : String = "Judul Task"
        get() = field
        set(value) {field=value}

    var image : Int = 0
        get() = field
        set(value) {field=value}

    constructor(name: String, image: Int) {
        this.name = name
        this.image = image
    }

    override fun toString(): String {
        return "ModelAbsentTeacher(name='$name', image=$image)"
    }
}