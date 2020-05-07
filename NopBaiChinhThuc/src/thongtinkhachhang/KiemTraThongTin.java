package thongtinkhachhang;

public class KiemTraThongTin {
public static boolean kiemTraTen(String hoVanTen) {
	String checkName = "^[a-zA-Z\\s]+$";
	if (hoVanTen.matches(checkName) == true) {
		return true;
	} else {
		System.out.println("!!! Ban da nhap sai. Vui long nhap lai.\n");
	}
	return false;
}

public static boolean kiemTraNgayThangNamSinh(int ngay, int thang, int nam) {
	if (nam <= 0 || thang <= 0 || ngay <= 0) {
		return false;
	}
	
	if (nam > 2004 || nam < 1800) {
		return false;
	}
	
	int[] thang30Ngay = { 4, 6, 9, 11 };
	int[] thang31Ngay = { 1, 3, 5, 7, 8, 10, 12 };

	boolean namNhuan;

	if (nam % 4 == 0) {
		namNhuan = true;
	} else {
		namNhuan = false;
	}

	// nam nhuan
	if (namNhuan == true) {
		if (thang <= 12 || thang >= 1) {
			if (thang == 2) {
				if (ngay < 1 || ngay > 29) {
					return false;
				} else {
					return true;
				}
			}
		} else {
			return false;
		}

		for (int x : thang30Ngay) {
			if (thang == x) {
				if (ngay < 1 || ngay > 30) {
					return false;
				} else {
					return true;
				}
			}
		}

		for (int i : thang31Ngay) {
			if (thang == i) {
				if (ngay < 1 || ngay > 30) {
					return false;
				} else {
					return true;
				}
			}
		}

	}

	// nam khong nhuan
	if (namNhuan == false) {
		if (thang <= 12 || thang >= 1) {
			if (thang == 2) {
				if (ngay < 1 || ngay > 28) {
					return false;
				} else {
					return true;
				}
			}
		} else {
			return false;
		}

		for (int x : thang30Ngay) {
			if (thang == x) {
				if (ngay < 1 || ngay > 30) {
					return false;
				} else {
					return true;
				}
			}
		}

		for (int i : thang31Ngay) {
			if (thang == i) {
				if (ngay < 1 || ngay > 30) {
					return false;
				} else {
					return true;
				}
			}
		}

	}
	return false;
}

public static boolean kiemTraSoCanCuoc(String soCanCuoc) {
	String checkID = "[0-9]{12}";
	if (soCanCuoc.matches(checkID) == true) {
		return true;
	} else {
		System.out.println("!!! Ban da nhap sai. Vui long nhap lai.\n");
		return false;
	}
}

public static boolean kiemTraSoDienThoai (String soDienThoai) {
	String checkPhoneNumber = "0[0-9]{9}";
	if (soDienThoai.matches(checkPhoneNumber) == true) {
		return true;
	} else {
		System.out.println("!!! Ban da nhap sai. Vui long nhap lai.\n");
	}
	return false;
}

public static boolean	kiemTraSoDuTaiKhoan(int soDuTaiKhoan) {
	if (soDuTaiKhoan <= 0) {
		System.out.println("!!! Ban da nhap sai. Vui long nhap gia tri lon hon 0.\n");
		return false;
	} 
	return true;
}
}
