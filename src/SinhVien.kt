class SinhVien{
    var ma: Int = 0
    var ten: String = ""
    var tuoi: Int = 0
    var dsMonHoc: MutableList<Pair<String, Double>> = mutableListOf()

    constructor(ma: Int, ten: String, tuoi: Int, dsMonHoc: MutableList<Pair<String, Double>>){
        this.ma = ma
        this.ten = ten
        this.tuoi = tuoi
        this.dsMonHoc = dsMonHoc
    }

    fun tinhDiemTB(): Double{
        if(dsMonHoc.isEmpty()){
            return 0.0
        }
        var tong = 0.0
        for((mon, diem) in dsMonHoc) {
            tong += diem
        }
        return (tong / dsMonHoc.size).let { String.format("%.2f", it).toDouble() }
    }

    fun xuat(){
        println("MSSV: $ma")
        println("Ho va ten: $ten")
        println("Tuoi: $tuoi")
        println("Diem TB: ${tinhDiemTB()}")
    }
}