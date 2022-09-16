package com.konexus.classroom.modeldata

data class ModelResultTask(val NIS: String?, val Nama: String?, val Kelas: String?, val Soal: String?){

    override fun toString(): String {
        return "ModelResultTask(NIS=$NIS, Nama=$Nama, Kelas=$Kelas, Soal=$Soal)"
    }
}