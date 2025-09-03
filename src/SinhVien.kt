class SinhVien {
    var ma: Int = 0
    var ten: String = ""
    var tuoi: Int? = 0
    var dsMonHoc: MutableSet<MonHoc> = mutableSetOf()

    constructor(ma: Int, ten: String, tuoi: Int?, dsMonHoc: MutableSet<MonHoc> = mutableSetOf()) {
        this.ma = ma
        this.ten = ten
        this.tuoi = tuoi
        this.dsMonHoc = dsMonHoc
    }

    fun tinhDiemTB(): Double {
        if (dsMonHoc.isEmpty()) {
            return 0.0
        }
        var tong = 0.0
        var tongTinChi = dsMonHoc.sumOf { it.soTinChi }
        for (mh in dsMonHoc) {
            tong += mh.diem * mh.soTinChi
        }
        return (tong / tongTinChi).let { String.format("%.2f", it).toDouble() }
    }

    fun xuat() {
        println("MSSV: $ma")
        println("Họ tên: $ten")
        println("Tuổi: $tuoi")
        if (dsMonHoc.isEmpty()) {
            println("Môn học: (chưa có)")
        } else {
            println("Môn học:")
            dsMonHoc.forEachIndexed { i, mh ->
                println("  ${i + 1}. ${mh.ten}: ${mh.diem}")
            }
        }
        println("Điểm TB: ${tinhDiemTB()}")
    }
}