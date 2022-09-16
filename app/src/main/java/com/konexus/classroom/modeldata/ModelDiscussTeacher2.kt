package com.konexus.classroom.modeldata

class ModelDiscussTeacher2 {



    var pos : String?
        get() = field
        set(value) {field=value}

    constructor(pos: String?) {

        this.pos = pos
    }

    override fun toString(): String {
        return "ModelDiscussTeacher2(pos=$pos)"
    }
}