package Lab1;

import java.util.Scanner;

public class Lab1Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("nhap chieu dai HCN: ");
		Double CD = scanner.nextDouble();
		
		System.out.print("nhap chieu rong HCN: ");
		Double CR = scanner.nextDouble();	
		
		Double tinhChuVi = (CD + CR) * 2;
		Double tinhDienTich = (CD * CR);
		
		System.out.println("Chu vi hinh chu nhat la: " + tinhChuVi);
		System.out.print("Dien tich hinh chu nhat la: " + tinhDienTich);
		}
	
}
