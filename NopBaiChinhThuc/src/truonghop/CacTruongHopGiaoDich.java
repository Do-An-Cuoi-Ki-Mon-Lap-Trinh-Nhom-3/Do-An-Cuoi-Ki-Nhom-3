package truonghop;

public cpublic static void truongHop1(int soDuTaiKhoan) {
			
			System.out.println("\n+----------------------+");
			System.out.println("|   THEO YEU CAU HAI   |");
			System.out.println("+----------------------+\n");
			
			System.out.println("\t >> Cac truong hop co the xay ra:");
			System.out.println("\t =================================");
			
			System.out.println("\n===============");
			System.out.println("|  A - B - C  |");
			System.out.println("===============\n");
			
			int tranA = bangchungkhoan.GiaChungKhoan.tranA();
			int tranB = bangchungkhoan.GiaChungKhoan.tranB();
			int tranC = bangchungkhoan.GiaChungKhoan.tranC();
			
			int sanA = bangchungkhoan.GiaChungKhoan.sanA();
			int sanB = bangchungkhoan.GiaChungKhoan.sanA();
			int sanC = bangchungkhoan.GiaChungKhoan.sanA();
			
			
			int tienDu1 = soDuTaiKhoan;
			
			int muaTranA = (tienDu1 / 2) / tranA;
			tienDu1 = tienDu1 - muaTranA*tranA;
			int muaTranB = (tienDu1/2) / tranB;
			tienDu1 = tienDu1 - muaTranB*tranB;
			int muaTranC = (tienDu1/2) / tranC;
			
			int tienDu2 = soDuTaiKhoan;
			
			int muaSanA = (tienDu2 / 2) / sanA;
			tienDu2 = tienDu2 - muaSanA*sanA;
			int muaSanB = (tienDu2 / 2) / sanB;
			tienDu2 = tienDu2 - muaSanB*sanB;
			int muaSanC = (tienDu2 / 2) / sanC;
			tienDu2 = tienDu2 - muaSanC*sanC;
			
			System.out.println("=========================================================================");
			System.out.println(" MA CO PHIEU          SL MUA DUOC GIA TRAN          SL MUA DUOC GIA SAN");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("     A                       " + muaTranA + "                               " + muaSanA);
			System.out.println("     B                       " + muaTranB + "                               " + muaSanB);
			System.out.println("     C                       " + muaTranC + "                               " + muaSanC);
			System.out.println("=========================================================================\n");
		}

		public static void truongHop2(int soDuTaiKhoan) {	
			
			System.out.println("\n===============");
			System.out.println("|  A - C - B  |");
			System.out.println("===============\n");
			
			int tranA = bangchungkhoan.GiaChungKhoan.tranA();
			int tranB = bangchungkhoan.GiaChungKhoan.tranB();
			int tranC = bangchungkhoan.GiaChungKhoan.tranC();
			
			int tienDu = soDuTaiKhoan;
			
			int muaTranA = (tienDu / 2) / tranA;
			tienDu = tienDu - muaTranA*tranA;
			int muaTranC = (tienDu/2) / tranC;
			tienDu = tienDu - muaTranC*tranC;
			int muaTranB = (tienDu/2) / tranB;
			//tienDu = tienDu - muaTranB*tranB;
			
				
			System.out.println("=========================================");
			System.out.println(" MA CO PHIEU          SO LUONG MUA DUOC");
			System.out.println("-----------------------------------------");
			System.out.println("     A                       " + muaTranA);	
			System.out.println("     C                       " + muaTranC);
			System.out.println("     B                       " + muaTranB);
			System.out.println("=========================================\n");
		}

		public static void truongHop3(int soDuTaiKhoan) {	
			
			System.out.println("\n===============");
			System.out.println("|  B - A - C  |");
			System.out.println("===============\n");
			
			int tranA = bangchungkhoan.GiaChungKhoan.tranA();
			int tranB = bangchungkhoan.GiaChungKhoan.tranB();
			int tranC = bangchungkhoan.GiaChungKhoan.tranC();
			
			int tienDu = soDuTaiKhoan;
			
			int muaTranB = (tienDu/2) / tranB;
			tienDu = tienDu - muaTranB*tranB;
			int muaTranA = (tienDu / 2) / tranA;
			tienDu = tienDu - muaTranA*tranA;
			int muaTranC = (tienDu/2) / tranC;
			//tienDu = tienDu - muaTranC*tranC;
			
				
			System.out.println("=========================================");
			System.out.println(" MA CO PHIEU          SO LUONG MUA DUOC");
			System.out.println("-----------------------------------------");
			System.out.println("     B                       " + muaTranB);
			System.out.println("     A                       " + muaTranA);
			System.out.println("     C                       " + muaTranC);
			System.out.println("=========================================\n");
		}

		public static void truongHop4(int soDuTaiKhoan) {	
			
			System.out.println("\n===============");
			System.out.println("|  B - C - A  |");
			System.out.println("===============\n");
			
			int tranA = bangchungkhoan.GiaChungKhoan.tranA();
			int tranB = bangchungkhoan.GiaChungKhoan.tranB();
			int tranC = bangchungkhoan.GiaChungKhoan.tranC();
			
			int tienDu = soDuTaiKhoan;
			
			int muaTranB = (tienDu/2) / tranB;
			tienDu = tienDu - muaTranB*tranB;
			int muaTranC = (tienDu/2) / tranC;
			tienDu = tienDu - muaTranC*tranC;
			int muaTranA = (tienDu / 2) / tranA;
			//tienDu = tienDu - muaTranA*tranA;
			
			
				
			System.out.println("=========================================");
			System.out.println(" MA CO PHIEU          SO LUONG MUA DUOC");
			System.out.println("-----------------------------------------");
			System.out.println("     B                       " + muaTranB);
			System.out.println("     C                       " + muaTranC);
			System.out.println("     A                       " + muaTranA);	
			System.out.println("=========================================\n");
		}

		public static void truongHop5(int soDuTaiKhoan) {	
			
			System.out.println("\n===============");
			System.out.println("|  C - B - A  |");
			System.out.println("===============\n");
			
			int tranA = bangchungkhoan.GiaChungKhoan.tranA();
			int tranB = bangchungkhoan.GiaChungKhoan.tranB();
			int tranC = bangchungkhoan.GiaChungKhoan.tranC();
			
			int tienDu = soDuTaiKhoan;
			
			
			int muaTranC = (tienDu/2) / tranC;
			tienDu = tienDu - muaTranC*tranC;
			int muaTranB = (tienDu/2) / tranB;
			tienDu = tienDu - muaTranB*tranB;
			int muaTranA = (tienDu / 2) / tranA;
			//tienDu = tienDu - muaTranA*tranA;
			
			
				
			System.out.println("=========================================");
			System.out.println(" MA CO PHIEU          SO LUONG MUA DUOC");
			System.out.println("-----------------------------------------");	
			System.out.println("     C                       " + muaTranC);
			System.out.println("     B                       " + muaTranB);
			System.out.println("     A                       " + muaTranA);	
			System.out.println("=========================================\n");
		}

		public static void truongHop6(int soDuTaiKhoan) {	
			
			System.out.println("\n===============");
			System.out.println("|  C - A - B  |");
			System.out.println("===============\n");
			
			int tranA = bangchungkhoan.GiaChungKhoan.tranA();
			int tranB = bangchungkhoan.GiaChungKhoan.tranB();
			int tranC = bangchungkhoan.GiaChungKhoan.tranC();
			
			int tienDu = soDuTaiKhoan;
			
			
			int muaTranC = (tienDu/2) / tranC;
			tienDu = tienDu - muaTranC*tranC;
			int muaTranA = (tienDu / 2) / tranA;
			tienDu = tienDu - muaTranA*tranA;
			int muaTranB = (tienDu/2) / tranB;
			//tienDu = tienDu - muaTranB*tranB;
			
			
			
				
			System.out.println("=========================================");
			System.out.println(" MA CO PHIEU          SO LUONG MUA DUOC");
			System.out.println("-----------------------------------------");	
			System.out.println("     C                       " + muaTranC);
			System.out.println("     A                       " + muaTranA);	
			System.out.println("     B                       " + muaTranB);
			System.out.println("=========================================\n");
		}
}
