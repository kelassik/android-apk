package com.konexus.classroom.modeldata

class ModelDataButtonSekolah {

    var imagesekolah : Int = 0
        get() = field
        set(value) {field=value}

    var namasekolah : String = "Nama Sekolah"
        get() = field
        set(value) {field=value}



    constructor(imagesekolah: Int, namasekolah: String) {

        this.imagesekolah = imagesekolah
        this.namasekolah = namasekolah
    }


    override fun toString(): String {
        return "ModelDataDiscussion(imagesekolah='$imagesekolah', ," +
                "namasekolah=$namasekolah)"
    }


}