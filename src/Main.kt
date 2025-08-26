//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("1. Them sinh vien")
    println("2. Hien thi danh sach sinh vien")
    println("3. Tim kiem sinh vien theo ten")
    println("4. Xoa sinh vien theo ten")
    println("5. Thoat")
    val dsSv = mutableListOf<SinhVien>()
    while (true) {
        print("Nhap lua chon: ")
        val choice = readLine()!!.toInt()
        when (choice) {
            1 -> {
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
                    val dsMonHoc = mutableListOf<Pair<String, Double>>()
                    for (i in 1..soMonHoc) {
                        print("Nhap ten mon hoc thu $i: ")
                        val tenMonHoc = readLine()!!
                        print("Nhap diem mon hoc thu $i: ")
                        val diemMonHoc = readLine()!!.toDouble()
                        dsMonHoc.add(Pair(tenMonHoc, diemMonHoc))
                    }
                    val sv = SinhVien(ma, ten, tuoi, dsMonHoc)
                    dsSv.add(sv)
                }
                println("Da them $n sinh vien")
            }
            2 -> {
                println("Hien thi danh sach sinh vien")
                for(sv in dsSv){
                    sv.xuat()
                    println("---------------")
                }
            }
            3 -> {
                println("Tim kiem sinh vien theo ten")
                print("Nhap ten can tim: ")
                val tenCanTim = readLine()!!
                val ketQua = dsSv.filter { it.ten.contains(tenCanTim, ignoreCase = true) }
                if(ketQua.isEmpty()){
                    println("Khong tim thay sinh vien")
                }else{
                    for(sv in ketQua){
                        sv.xuat()
                        println("---------------")
                    }
                }
            }
            4 -> {
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
            5 -> {
                println("Thoat")
                break
            }
            else -> {
                println("Lua chon khong hop le")
            }
        }
    }
}