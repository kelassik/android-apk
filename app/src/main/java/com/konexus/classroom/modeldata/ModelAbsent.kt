package com.konexus.classroom.modeldata

class ModelAbsent {
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
        return "ModelAbsent(name='$name', image=$image)"
    }
}