package thaotac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nhap {
	static Scanner sc = new Scanner(System.in);

	public static String nhapChuoi() {
		String x = sc.nextLine();
		return x;
	}

	public static int nhapSoNguyenCoKiemTra() {

		int userInput = 0, notInt = 0, newInput = 0;
		while (notInt == 0) {
			try {
				newInput = sc.nextInt();
				userInput = newInput;
				notInt = 1;
			} catch (InputMismatchException e) {
				System.out.println("!!! Ban da nhap sai. Vui long nhap so nguyen.\n");

				String s = sc.nextLine();
			}
		}
		return userInput;
	}
	
	public static void chongTroi() {
		String s = thaotac.Nhap.nhapChuoi();
	}
}
