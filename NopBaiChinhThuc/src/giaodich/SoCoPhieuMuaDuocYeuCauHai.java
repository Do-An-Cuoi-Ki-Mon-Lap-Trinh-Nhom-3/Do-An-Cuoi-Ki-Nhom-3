package giaodich;

public class SoCoPhieuMuaDuocYeuCauHai {
public static void muaTheoYeuCauHai(int soDuTaiKhoan) {
	int tranA = bangchungkhoan.GiaChungKhoan.tranA();
	int tranB = bangchungkhoan.GiaChungKhoan.tranB();
	int tranC = bangchungkhoan.GiaChungKhoan.tranC();
	
	int sanA = bangchungkhoan.GiaChungKhoan.sanA();
	int sanB = bangchungkhoan.GiaChungKhoan.sanB();
	int sanC = bangchungkhoan.GiaChungKhoan.sanC();
	
	int muaTranA = soDuTaiKhoan / tranA;
	int muaTranB = soDuTaiKhoan / tranB;
	int muaTranC = soDuTaiKhoan / tranC;
	
	int muaSanA = soDuTaiKhoan / sanA;
	int muaSanB = soDuTaiKhoan / sanB;
	int muaSanC = soDuTaiKhoan / sanC;
	
	
	
	String donVi = " Co phieu";
	
	System.out.println("\n+----------------------+");
	System.out.println("|   THEO YEU CAU HAI   |");
	System.out.println("+----------------------+\n");
	
	System.out.println("\t\t========== GIA TRAN ==========");
	System.out.println("\t\t Ma co phieu A: " + muaTranA + donVi);
	System.out.println("\t\t Ma co phieu B: " + muaTranB + donVi);
	System.out.println("\t\t Ma co phieu C: " + muaTranC + donVi);
	
	System.out.println("\n\t\t========== GIA SAN ==========");
	System.out.println("\t\t Ma co phieu A: " + muaSanA + donVi);
	System.out.println("\t\t Ma co phieu B: " + muaSanB + donVi);
	System.out.println("\t\t Ma co phieu C: " + muaSanC + donVi);
	System.out.println();
}
}
