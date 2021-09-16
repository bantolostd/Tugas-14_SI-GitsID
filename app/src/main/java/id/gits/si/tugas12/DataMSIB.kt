package id.gits.si.tugas12

object DataMSIB {
    private val namaProgram = arrayOf(
        "Product Management Internship",
        "Software Development Engineer (Frontend, Backend) Internship",
        "Mobile Development (iOs & Android) Internship",
        "Menjadi Mobile App Developer dengan Android Java",
        "Android with Java Native"
    )

    private val namaPerusahaan = arrayOf(
        "Blibli.com",
        "Blibli.com",
        "Blibli.com",
        "GITS.ID",
        "Hacktiv8"
    )

    private val deskripsiProgram = arrayOf(
        "Semester 1- Pengembangan Kemampuan berdasarkan Jurusan Pilihan | Semester 2 - Kolaborasi",
        "Semester 1- Pengembangan Kemampuan berdasarkan Jurusan Pilihan | Semester 2 - Kolaborasi",
        "Semester 1- Pengembangan Kemampuan berdasarkan Jurusan Pilihan | Semester 2 - Kolaborasi",
        "Menjadi Mobile App Developer dengan Android Java",
        "Android with Java Native"
    )

    private val kotaPerusahaan = arrayOf(
        "Kota Jakarta Pusat",
        "Kota Jakarta Pusat",
        "Kota Jakarta Pusat",
        "Kota Bandung",
        "Kota Jakarta Selatan",
    )

    private val kategoriProgram = arrayOf(
        "Magang",
        "Magang",
        "Magang",
        "Studi Independen",
        "Studi Independen",
    )

    private val iconKategori = intArrayOf(
        R.drawable.icon_magang,
        R.drawable.icon_magang,
        R.drawable.icon_magang,
        R.drawable.icon_si,
        R.drawable.icon_si
    )

    private val logoPerusahaan = intArrayOf(
        R.drawable.logo_blibli,
        R.drawable.logo_blibli,
        R.drawable.logo_blibli,
        R.drawable.logo_gits,
        R.drawable.logo_hacktiv8
    )

    val listData: ArrayList<ProgramMSIB>
    get() {
        var list = arrayListOf<ProgramMSIB>()
        for(i in namaProgram.indices) {
            val program = ProgramMSIB()
            program.namaProgram = namaProgram[i]
            program.namaPerusahaan = namaPerusahaan[i]
            program.deskripsiProgram = deskripsiProgram[i]
            program.kotaPerusahaan = kotaPerusahaan[i]
            program.kategoriProgram = kategoriProgram[i]
            program.iconKategori = iconKategori[i]
            program.photo = logoPerusahaan[i]
            list.add(program)
        }
        return list
    }
}