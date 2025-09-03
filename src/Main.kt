
fun main() {
    println("Quan ly sinh vien")
    for (lc in LuaChonMenu.values()) {
        println("${lc.giaTri}. ${lc.name.replace('_', ' ')}")
    }
    val dsSv = mutableListOf<SinhVien>()
    while (true) {
        print("Nhap lua chon: ")
        val choice = readInt("")
        when (choice) {
            1 -> themSinhVien(dsSv)
            2 -> hienThiDanhSachSinhVien(dsSv)
            3 -> timKiemSinhVien(dsSv)
            4 -> xoaSinhVien(dsSv)
            5 -> capnhatSinhVien(dsSv)
            6 -> {
                println("Thoat chuong trinh")
                return
            }
            else -> println("Lua chon khong hop le")
        }
    }
}

fun readInt(p: String): Int {
    while (true) {
        print(p)
        val input = readLine()
        try {
            if (input != null && input.toIntOrNull() != null) {
                return input.toInt()
            }
        } catch (e: NumberFormatException) {
            println("Vui long nhap so nguyen hop le.")
        }
    }
}

fun themSinhVien(dsSv: MutableList<SinhVien>) {
    println("Nhap thong tin sinh vien")
    print("Nhap so sinh vien can them: ")
    val n = readLine()!!.toInt()
    for(i in 1..n) {
        println("Nhap sinh vien thu $i")
        print("Nhap ma sv: ")
        val ma = readLine()!!.toInt()
        print("Nhap ten: ")
        val ten = readLine()!!
        print("Nhap tuoi: ")
        val tuoi = readLine()!!.toInt()
        print("Nhap so mon hoc: ")
        val soMonHoc = readLine()!!.toInt()
        val dsMonHoc = mutableSetOf<MonHoc>()
        repeat(soMonHoc){
            println("Nhap mon hoc thu ${it+1}")
            print("Nhap ma mon hoc: ")
            val maMonHoc = readLine()!!.toInt()
            print("Nhap ten mon hoc: ")
            val tenMonHoc = readLine()!!
            print("Nhap diem mon hoc: ")
            val diemMonHoc = readLine()!!.toDouble()
            print("Nhap so tin chi mon hoc: ")
            val soTinChi = readLine()!!.toInt()
            val mh = MonHoc(maMonHoc, tenMonHoc, diemMonHoc, soTinChi)
            dsMonHoc.add(mh)
        }
        val sv = SinhVien(ma, ten, tuoi, dsMonHoc)
        dsSv.add(sv)
    }
    println("Da them $n sinh vien")
}

fun hienThiDanhSachSinhVien(dsSv: MutableList<SinhVien>) {
    println("Hien thi danh sach sinh vien")
    dsSv.sortBy {it.ten.lowercase()}
    for(i in dsSv.indices){
        dsSv[i].xuat()
        println("---------------")
    }
}

fun timKiemSinhVien(dsSv: MutableList<SinhVien>) {
    println("Tim kiem sinh vien theo ten")
    print("Nhap ten can tim: ")
    val tenCanTim = readLine()!!
    val ketQua = dsSv.filter { it.ten.contains(tenCanTim, ignoreCase = true) }
    if(ketQua.isEmpty()){
        println("Khong tim thay sinh vien")
    }else{
        for(i in ketQua.indices){
            ketQua[i].xuat()
            println("---------------")
        }
    }
}

fun xoaSinhVien(dsSv: MutableList<SinhVien>) {
    println("Xoa sinh vien theo ten")
    print("Nhap ten can xoa: ")
    val tenCanXoa = readLine()!!
    val ketQua = dsSv.filter { it.ten.contains(tenCanXoa, ignoreCase = true) }
    if(ketQua.isEmpty()){
        println("Khong tim thay sinh vien")
    }else{
        for(sv in ketQua){
            dsSv.remove(sv)
        }
        println("Da xoa ${ketQua.size} sinh vien")
    }
}

fun capnhatSinhVien(dsSv: MutableList<SinhVien>) {
    println("Cap nhat thong tin sinh vien")
    print("Nhap ma sv can cap nhat: ")
    val maCanCapNhat = readLine()!!.toInt()
    val sv = dsSv.find { it.ma == maCanCapNhat }
    if(sv == null){
        println("Khong tim thay sinh vien $maCanCapNhat")
        return
    }
    println("1: Doi ten | 2: Doi tuoi | 3: Them mon hoc | 4: Xoa mon hoc | 5: Cap nhat diem mon hoc | Khac: Thoat")
    val choice = readInt("Nhap lua chon: ")
    when(choice){
        1 -> {
            print("Nhap ten moi: ")
            val tenMoi = readLine()!!
            sv.ten = tenMoi
            println("Da cap nhat ten")
        }
        2 -> {
            print("Nhap tuoi moi: ")
            val tuoiMoi = readLine()!!.toInt()
            sv.tuoi = tuoiMoi
            println("Da cap nhat tuoi")
        }
        3 -> {
            print("Nhap ma mon hoc: ")
            val maMonHoc = readLine()!!.toInt()
            print("Nhap ten mon hoc: ")
            val tenMonHoc = readLine()!!
            print("Nhap diem mon hoc: ")
            val diemMonHoc = readLine()!!.toDouble()
            print("Nhap so tin chi mon hoc: ")
            val soTinChi = readLine()!!.toInt()
            val mh = MonHoc(maMonHoc, tenMonHoc, diemMonHoc, soTinChi)
            sv.dsMonHoc.add(mh)
            println("Da them mon hoc")
        }
        4 -> {
            print("Nhap ma mon hoc can xoa: ")
            val maMonHocCanXoa = readLine()!!.toInt()
            val mh = sv.dsMonHoc.find { it.ma == maMonHocCanXoa }
            if(mh == null){
                println("Khong tim thay mon hoc")
            }else{
                sv.dsMonHoc.remove(mh)
                println("Da xoa mon hoc")
            }
        }
        5 -> {
            print("Nhap ma mon hoc can cap nhat diem: ")
            val maMonHocCanCapNhat = readLine()!!.toInt()
            val mh = sv.dsMonHoc.find { it.ma == maMonHocCanCapNhat }
            if(mh == null){
                println("Khong tim thay mon hoc")
            }else{
                print("Nhap diem moi: ")
                val diemMoi = readLine()!!.toDouble()
                mh.diem = diemMoi
                println("Da cap nhat diem")
            }
        }
        else -> println("Thoat khong cap nhat")
    }
}
