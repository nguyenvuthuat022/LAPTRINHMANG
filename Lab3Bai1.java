package Lab3;

import java.util.Scanner;

public class Lab3Bai1 {

	public static void main(String[] args) {
		int n;
		boolean ok = true;
		
		Scanner a = new Scanner(System.in);
		System.out.print("Nhập n: ");
		n = a.nextInt();
		
		for(int i=2; i < n-1; i++) // n là số nhập từ bàn phím
			{ 
				if( n % i == 0)
				{
					ok = false;
					break;
				}
			}
		if ( ok == true) 
			{
				System.out.print(" " + n + " là số nguyên tố ");
			}
			else
			{
				System.out.print(" " + n + " không phải là số nguyên tố ");
			}
	}
}
