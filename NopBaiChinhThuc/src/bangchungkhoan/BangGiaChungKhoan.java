package bangchungkhoan;

public class BangGiaChungKhoan {
public static void bangGia() {
	String donVi = " VND";
	System.out.println("+--------------------------------------------------------------------------+");
	System.out.println("|                        SAN CHUNG KHOAN TP HCM VA HA NOI                  |");
	System.out.println("+--------------------------------------------------------------------------+");
	System.out.println("|   >> MA CO PHIEU <<    |     >> GIA TRAN <<        |     >> GIA SAN <<   |");
	System.out.println("+------------------------+---------------------------+---------------------+");
	System.out.println("|           A            |        " + bangchungkhoan.GiaChungKhoan.tranA() + donVi + "           |       " + bangchungkhoan.GiaChungKhoan.sanA()
			+ donVi + "      |");
	System.out.println("|           B            |        " + bangchungkhoan.GiaChungKhoan.tranB() + donVi + "           |       " + bangchungkhoan.GiaChungKhoan.sanB()
			+ donVi + "      |");
	System.out.println("|           C            |        " + bangchungkhoan.GiaChungKhoan.tranC() + donVi + "           |       " + bangchungkhoan.GiaChungKhoan.sanC()
			+ donVi + "      |");
	System.out.println("+--------------------------------------------------------------------------+");
	System.out.println();
}
}
