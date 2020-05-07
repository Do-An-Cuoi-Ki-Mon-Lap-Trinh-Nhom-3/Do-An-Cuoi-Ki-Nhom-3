package main;

public class TestProgram {

	public static void chay() {

		bangchungkhoan.BangGiaChungKhoan.bangGia();
		String hoVaTen, soDienThoai, soCanCuoc;
		int ngaySinh = 0,thangSinh = 0,namSinh = 0, soDuTaiKhoan = 0;
			
			do {
				hoVaTen = thongtinkhachhang.NhapThongTin.hoVaTen();
			} while (thongtinkhachhang.KiemTraThongTin.kiemTraTen(hoVaTen)==false);
			
			boolean check = true;
			do {
				if (check == false) {
					System.out.println("\t !!! Ban da nhap sai. Vui long nhap lai. \n");
				}
				System.out.println("\t>> Ngay, thang, nam sinh: ");
				ngaySinh = thongtinkhachhang.NhapThongTin.ngaySinh();
				thangSinh = thongtinkhachhang.NhapThongTin.thangSinh();
				namSinh =  thongtinkhachhang.NhapThongTin.namSinh();
				
				check = thongtinkhachhang.KiemTraThongTin.kiemTraNgayThangNamSinh(ngaySinh, thangSinh, namSinh);
			} while (thongtinkhachhang.KiemTraThongTin.kiemTraNgayThangNamSinh(ngaySinh, thangSinh, namSinh) == false);
		
			thaotac.Nhap.chongTroi();
			
			do {
				soCanCuoc = thongtinkhachhang.NhapThongTin.soCanCuoc();
			} while (thongtinkhachhang.KiemTraThongTin.kiemTraSoCanCuoc(soCanCuoc)==false);
			
			do {
				soDienThoai = thongtinkhachhang.NhapThongTin.soDienThoai();
			} while (thongtinkhachhang.KiemTraThongTin.kiemTraSoDienThoai(soDienThoai)==false);
			
			do {
				soDuTaiKhoan = thongtinkhachhang.NhapThongTin.soDuTaiKhoan();
			} while (thongtinkhachhang.KiemTraThongTin.kiemTraSoDuTaiKhoan(soDuTaiKhoan)==false);
		
			thongtinkhachhang.XuatThongTinKhachHang.thongTinKhachHang(hoVaTen, ngaySinh, thangSinh, namSinh, soCanCuoc, soDienThoai, soDuTaiKhoan);
			
			bangchungkhoan.BangGiaChungKhoan.bangGia();
			
			giaodich.SoCoPhieuMuaDuoc.muaGiaTranGiaSan(soDuTaiKhoan);
			/*
			int choose = 1;
			do {
			choose = menu.LuaChon.muaHayKhong();
			switch (choose) {
			case 1:
				System.out.println("chon 1");
				break;
			case 2:
				System.out.println("chon thoat");
				break;
			}
			} while (choose < 1 || choose > 2);
			*/
			
			truonghop.CacTruongHopGiaoDich.truongHop1(soDuTaiKhoan);
			truonghop.CacTruongHopGiaoDich.truongHop2(soDuTaiKhoan);
			truonghop.CacTruongHopGiaoDich.truongHop3(soDuTaiKhoan);
			truonghop.CacTruongHopGiaoDich.truongHop4(soDuTaiKhoan);
			truonghop.CacTruongHopGiaoDich.truongHop5(soDuTaiKhoan);
			truonghop.CacTruongHopGiaoDich.truongHop6(soDuTaiKhoan);
			
	}

}
