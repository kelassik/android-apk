package com.konexus.classroom.model

class Relasi(
    override var imgSekolah: Int = 0,
    override var namaSekolah: String,
    var muridSekolah: String = "",
    var memberSekolah: String = ""
) : Sekolah()