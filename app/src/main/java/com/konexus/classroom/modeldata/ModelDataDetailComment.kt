package com.konexus.classroom.modeldata

class ModelDataDetailComment {

    var name : String?
        get() = field
        set(value) {field=value}

    var pos : String?
        get() = field
        set(value) {field=value}

    constructor(name: String?, pos: String?) {
        this.name = name
        this.pos = pos
    }

    override fun toString(): String {
        return "ModelDataDetailComment(name='$name', pos=$pos)"
    }
}