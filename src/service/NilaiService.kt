package service

import model.Mahasiswa
import utils.hitungRataRata
import utils.konversiNilaiKeHuruf

class NilaiService {
    private val dataMahasiswa = mutableListOf<Mahasiswa>()

    fun tambahMahasiswa(m: Mahasiswa) {
        dataMahasiswa.add(m)
    }

    fun tampilkanSemua() {
        println("No | NIM       | Nama             | Rata-rata | Nilai Huruf")
        println("------------------------------------------------------------")
        dataMahasiswa.forEachIndexed { index, m ->
            val rataRata = hitungRataRata(m.tugas, m.uts, m.uas)
            val huruf = konversiNilaiKeHuruf(rataRata)
            println("${index + 1}  | ${m.nim} | ${m.nama.padEnd(16)} | ${"%.2f".format(rataRata)}    | $huruf")
        }
    }
}
