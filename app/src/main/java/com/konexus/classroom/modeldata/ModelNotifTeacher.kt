package com.konexus.classroom.modeldata

class ModelNotifTeacher {



    var imgnotif : Int = 0
        get() = field
        set(value) {field=value}

    var notifMsg : Int = 0
        get() = field
        set(value) {field=value}

    var namaNotif : String = "Nama Notifikasi"
        get() = field
        set(value) {field=value}

    var isiNotif : String = "Isi Notifikasi"
        get() = field
        set(value) {field=value}

    var isiNotif1 : String = "Isi Notifikasi 1"
        get() = field
        set(value) {field=value}



    constructor(imgnotif: Int, notifMsg: Int, namaNotif:String, isiNotif: String, isiNotif1 : String) {

        this.imgnotif = imgnotif
        this.notifMsg = notifMsg
        this.namaNotif = namaNotif
        this.isiNotif = isiNotif
        this.isiNotif1 = isiNotif1
    }

    override fun toString(): String {
        return "ModelNotifTeacher( imgnotif=$imgnotif, notifMsg=$notifMsg, namaNotif=$namaNotif, isiNotif=$isiNotif, isiNotif1=$isiNotif1)"
    }
}