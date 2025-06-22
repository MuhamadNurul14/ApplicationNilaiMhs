package utils

fun hitungRataRata(tugas: Double, uts: Double, uas: Double): Double {
    return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4)
}

fun konversiNilaiKeHuruf(nilai: Double): String {
    return when {
        nilai >= 85 -> "A"
        nilai >= 70 -> "B"
        nilai >= 60 -> "C"
        nilai >= 50 -> "D"
        else -> "E"
    }
}
