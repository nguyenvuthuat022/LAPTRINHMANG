package Lab1;

import java.util.Scanner;

public class Lab1Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("nhap canh cua hinh lap phuong: ");
		float canh = scanner.nextFloat();
		
		float thetich = canh * canh * canh;
		 //thetich = (float) Math.pow(canh ,3);
		
		System.out.printf("Hinh co the tich: " + thetich);

	}

}
