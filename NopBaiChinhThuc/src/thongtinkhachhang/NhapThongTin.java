package thongtinkhachhang;

public class NhapThongTin {
public static String hoVaTen() {
	System.out.print("\t>> Ho va ten: ");
	String hoVaTen = thaotac.Nhap.nhapChuoi();
	System.out.println();
	hoVaTen = hoVaTen.toUpperCase();
	return hoVaTen;
}

public static int ngaySinh() {
	System.out.print("\t\t> Ngay sinh: ");
	int ngaySinh = thaotac.Nhap.nhapSoNguyenCoKiemTra();
	return ngaySinh;
}

public static int thangSinh() {
	System.out.print("\t\t> Thang sinh: ");
	int thangSinh = thaotac.Nhap.nhapSoNguyenCoKiemTra();
	return thangSinh;
}

public static int namSinh() {
	System.out.print("\t\t> Nam sinh: ");
	int namSinh = thaotac.Nhap.nhapSoNguyenCoKiemTra();
	return namSinh;
}

public static String soCanCuoc() {
	System.out.print("\n\t>> So can cuoc cong dan: ");
	String soCanCuoc = thaotac.Nhap.nhapChuoi();
	return soCanCuoc;
}

public static String soDienThoai() {
	System.out.print("\n\t>> So dien thoai: ");
	String soDienThoai = thaotac.Nhap.nhapChuoi();
	return soDienThoai;
}

public static int soDuTaiKhoan() {
	System.out.print("\n\t>> So tien trong tai khoan: ");
	int soDuTaiKhoan = thaotac.Nhap.nhapSoNguyenCoKiemTra();
	return soDuTaiKhoan;
	
}
}
