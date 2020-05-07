package menu;

public class MuaChungKhoan {
	public static boolean kiemTraTaiKhoan(int soDuTaiKhoan) {

		int tranA = bangchungkhoan.GiaChungKhoan.tranA();
		int tranB = bangchungkhoan.GiaChungKhoan.tranB();
		int tranC = bangchungkhoan.GiaChungKhoan.tranC();

		int sanA = bangchungkhoan.GiaChungKhoan.sanA();
		int sanB = bangchungkhoan.GiaChungKhoan.sanB();
		int sanC = bangchungkhoan.GiaChungKhoan.sanC();

		if (soDuTaiKhoan >= tranA || soDuTaiKhoan >= tranB || soDuTaiKhoan >= tranC || soDuTaiKhoan >= sanA
				|| soDuTaiKhoan >= sanB || soDuTaiKhoan >= sanC) {
			return true;
		}
		return false;
	}

	public static int muaTranCoPhieuA(int soDuTaiKhoan) {
		int tranA = bangchungkhoan.GiaChungKhoan.tranA();
		int muaTranA = soDuTaiKhoan / tranA;
		boolean check = true;
		int soLuongMuaTranA = 0;

		do {
			if (check == false) {
				System.out.println("\t !!! Vui long nhap be hon hoac bang so co phieu mua duoc.\n");
			}
			System.out.print("\t> So luong co phieu muon mua: ");
			soLuongMuaTranA = thaotac.Nhap.nhapSoNguyenCoKiemTra();
			
			if (soLuongMuaTranA > muaTranA) {
				check = false;
			}
		} while (check == false);
		
		int thanhToan = soLuongMuaTranA * tranA;
		soDuTaiKhoan = soDuTaiKhoan - thanhToan;
		return soDuTaiKhoan;

	}
}
