package menu;

public class LuaChon {
	public static int muaHayKhong() {
		System.out.println("\n\t+============================+");
		System.out.println("\t|    1 - Mua chung khoan     |");
		System.out.println("\t|    2 - Thoat.              |");
		System.out.println("\t+============================+\n");
		
		System.out.print("\t>> Vui long lua chon: ");
		int x = thaotac.Nhap.nhapSoNguyenCoKiemTra();
		
		return x;
	}

}
