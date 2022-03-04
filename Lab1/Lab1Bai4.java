package Lab1;

import java.util.Scanner;

public class Lab1Bai4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("nhap a : ");
		float a = scanner.nextFloat();
		System.out.print("nhap b : ");
		float b = scanner.nextFloat();
		System.out.print("nhap c : ");
		float c = scanner.nextFloat();
		
		float delta =(float) Math.pow(b, 2)-4 * a * c;
		float sqrt = (float) Math.sqrt(delta);
		
		System.out.println("delta: " + delta);
		System.out.print("căn delta : " + sqrt);
	}

}
