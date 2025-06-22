package main

import model.Mahasiswa
import service.NilaiService

fun main() {
    val service = NilaiService()
    println("=== Aplikasi Manajemen Nilai Mahasiswa ===")
    print("Masukkan jumlah mahasiswa: ")
    val jumlah = readLine()?.toIntOrNull() ?: 0

    repeat(jumlah) {
        println("\nMahasiswa ke-${it + 1}")
        print("Nama: ")
        val nama = readLine().orEmpty()
        print("NIM: ")
        val nim = readLine().orEmpty()
        print("Nilai Tugas: ")
        val tugas = readLine()?.toDoubleOrNull() ?: 0.0
        print("Nilai UTS: ")
        val uts = readLine()?.toDoubleOrNull() ?: 0.0
        print("Nilai UAS: ")
        val uas = readLine()?.toDoubleOrNull() ?: 0.0

        val mhs = Mahasiswa(nama, nim, tugas, uts, uas)
        service.tambahMahasiswa(mhs)
    }

    println("\n=== Hasil Rekap Nilai ===")
    service.tampilkanSemua()
}
