package thongtinkhachhang;

public class XuatThongTinKhachHang {
public static void thongTinKhachHang(String hoVaTen, int ngaySinh, int thangSinh, int namSinh, String soCanCuoc, String soDienThoai, int soDuTaiKhoan) {
System.out.println("\n\t======================================");
System.out.println("\t|        THONG TIN KHACH HANG        |");
System.out.println("\t======================================\n");

String ngayThangNamSinh = ngaySinh + "/" + thangSinh + "/" + namSinh;
System.out.println("\t Ho va ten: " + hoVaTen);
System.out.println("\t Ma khach hang: " + soCanCuoc +"ABC");
System.out.println("\t Ngay sinh: " + ngayThangNamSinh);
System.out.println("\t So CCCD: " + soCanCuoc);
System.out.println("\t So dien thoai: " + soDienThoai);
System.out.println("\t So du tai khoan: " + soDuTaiKhoan + " VND");
System.out.println();
}
}
