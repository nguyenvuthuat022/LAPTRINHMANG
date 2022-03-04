package Lab2;

import java.util.Scanner;

public class Lab2Bai3 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Nhập số điện sử dụng: ");
	int a = scanner.nextInt();
	int tien;
	if (a<50) {
		tien= a*1000;
		System.out.print("Số tiền điện đã sử dụng là: "+ tien);
	}
	else {
		tien = 50*1000 +(a-50)*1200;
		System.out.print("Số tiền điện đã sử dụng là: "+ tien);
	}
}

}
