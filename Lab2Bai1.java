package Lab2;

import java.util.Scanner;

public class Lab2Bai1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Hệ số a: ");
		int a = scanner.nextInt();
		
		System.out.print("Hệ số b: ");
		int b = scanner.nextInt();
		
		double x =0;
		if (a==0) {
			if (b==0) {
				System.out.print("Phương trình vô số nghiệm");
			}
			else {
				System.out.print("Phương trình vô nghiệm");
			}
		}
		else {
			x = -b/a;
			System.out.print("Phương trình có nghiệm là: "+ x);
		}
	}

}
