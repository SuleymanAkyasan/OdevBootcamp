package com.suleyman.odevler

fun main() {

}

fun dereceyiFahrenheiteCevir(derece: Double): Double {
    return derece * 1.8 + 32
}

fun dikdortgenCevresi(uzunKenar: Double, kisaKenar: Double): Double {
    return 2 * (uzunKenar + kisaKenar)
}

fun faktoriyelHesapla(sayi: Int): Long {
    var sonuc = 1L
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

fun aHarfiniSay(kelime: String): Int {
    return kelime.count { it == 'a' || it == 'A' }
}

fun icAciToplamiHesapla(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

fun maasHesapla(gunSayisi: Int): Int {
    val calismaSaati = gunSayisi * 8
    return if (calismaSaati <= 160) {
        calismaSaati * 10
    } else {
        val mesaiSaati = calismaSaati - 160
        (160 * 10) + (mesaiSaati * 20)
    }
}

fun internetUcretiHesapla(kullanimGb: Int): Int {
    return if (kullanimGb <= 50) {
        100
    } else {
        val ekstraGb = kullanimGb - 50
        100 + (ekstraGb * 4)
    }
}
