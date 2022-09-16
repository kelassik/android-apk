package com.konexus.classroom.modeldata

class ModelDataRelasiSekolah {

    var imagesekolah : Int = 0
        get() = field
        set(value) {field=value}

    var namasekolah : String = "Nama Sekolah"
        get() = field
        set(value) {field=value}

    var muridsekolah : String = "Murid Sekolah"
        get() = field
        set(value) {field=value}

    var membersekolah : String = "Member Sekolah"
        get() = field
        set(value) {field=value}


    constructor(imagesekolah: Int, namasekolah: String, muridsekolah: String, membersekolah: String) {

        this.imagesekolah = imagesekolah
        this.namasekolah = namasekolah
        this.muridsekolah = muridsekolah
        this.membersekolah = membersekolah
    }


    override fun toString(): String {
        return "ModelDataDiscussion(imagesekolah='$imagesekolah', ," +
                "namasekolah=$namasekolah, muridsekolah='$muridsekolah', membersekolah='$membersekolah')"
    }


}