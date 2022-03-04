package Lab2;

import java.util.Scanner;

public class Lab2Bai4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Menu:");
		System.out.println("1: Giải phương trình bậc 1");
		System.out.println("2: Giải phương trình bậc 2");
		System.out.println("3: Tính tiền điện");
		System.out.println("4: Kết thúc");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lựa chọn của bạn là: ");
		int lc = scanner.nextInt();
		
		switch (lc) {
		case 1:
			giaipt1();
			break;
		case 2:
			giaipt2();
			break;
		case 3:
			tiendien();
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Vui lòng chọn từ 1 đến 4!");
			break;
		}
	}

	private static void tiendien() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số điện sử dụng: ");
		int a = scanner.nextInt();
		int tien;
		if (a<50) {
			tien= a*1000;
			System.out.print("Số tiền điện đã sử dụng là: "+tien);
		}
		else {
			tien = 50*1000 +(a-50)*1200;
			System.out.print("Số tiền điện đã sử dụng là: "+tien);
		}
	}

	private static void giaipt2() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số bậc 2, a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();
        //xét điều kiện đầu tiên
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
        }  
        //Tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        
        //Tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
	}

	private static void giaipt1() {
		// TODO Auto-generated method stub
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
			System.out.print("Phương trình có nghiệm là: "+x);
		}
	}


}
