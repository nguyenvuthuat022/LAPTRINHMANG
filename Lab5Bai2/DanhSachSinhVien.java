package Lab5Bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSinhVien {
	ArrayList<SinhVienPoLy> list = new ArrayList<SinhVienPoLy>();
	
	public void nhap() {
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ho ten sinh vien: ");
		String hoTen = scanner.nextLine();
		
		if ( hoTen == null || hoTen.equals("")) 
		{
			break;
		}
		System.out.print("Nhập tên nganh ( IT/Biz): ");
		String nganh = scanner.nextLine();
		
		if (nganh.equalsIgnoreCase ("IT"))
		{
			System.out.print("Diem Java: ");
			double diemJava = scanner.nextDouble();
			System.out.print("Nhap diem css: ");
			double diemCss = scanner.nextDouble();
			System.out.print("Nhap diem HTML: ");
			double diemHtml = scanner.nextDouble();
			SinhVienPoLy newSV = new SinhVienIT(hoTen, nganh, diemJava, diemCss, diemHtml);
			list.add(newSV);		
		} else if (nganh.equalsIgnoreCase( "Biz")) 
			{
			System.out.print("Nhap diem Marketting: ");
			double diemMarketting = scanner.nextDouble();
			System.out.print("Nhap diem Sales: ");
			double diemSales = scanner.nextDouble();
			SinhVienPoLy newSV = new SinhVienBiz(hoTen, nganh, diemMarketting, diemSales);
			list.add(newSV);
			}
	} while (true);
}
	public void xuat() 
	{
		for ( SinhVienPoLy sv : list) 
		{
			System.out.println("Họ tên: " + sv.getHoTen());
			System.out.println("Ngành: " + sv.getNganh());
			System.out.println("ĐiểmTB: " + sv.getDiem());
			System.out.println("Học lực: " + sv.getHocLuc());
			System.out.println("----------------------------");
		}
	}
	
	public void xuatGioi() {
		for (SinhVienPoLy sv : list) {
		if (sv.getHocLuc().equalsIgnoreCase( "Gioi")) 
		{
			System.out.println("Họ tên: " + sv.getHoTen());
			System.out.println("Ngành: " + sv.getNganh());
			System.out.println("ĐiểmTB: " + sv.getDiem());
			System.out.println("Học lực: " + sv.getHocLuc());
		}
	  }
	}
	
	Comparator<SinhVienPoLy> comp = new Comparator<SinhVienPoLy>() {
		@Override
		public int compare(SinhVienPoLy ly01, SinhVienPoLy ly02) 
			{
			return Double.compare(ly01.getDiem(), ly02.getDiem());
			}
		};
		
		public void sapXepTheoDiem() 
		{
			Collections.sort(list, comp);
			System.out.println("Sap xep tang dan theo diem");
			xuat();
		}
	
	public void menu() {
		Scanner s = new Scanner(System.in);
		int chon = 0;
		do {
		System.out.println("\nMenu chuong trinh");
		System.out.println("1. Nhập danh sách sinh viên");
		System.out.println("2. Xuất thông tin danh sách sinh viên");
		System.out.println("3. Xuất danh sách sinh viên có học LỰC giỏi");
		System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
		System.out.println("0. Thoat");
		System.out.print("xin mời nhập: ");
		
		chon = s.nextInt();
		if (chon != 0) {
			switch (chon) {
				case 0:
					break;
				case 1:
					nhap();
					break;
				case 2:
					xuat();
					break;
				case 3:
					xuatGioi();
					break;
				case 4:
					sapXepTheoDiem();
					break;
					
				default:
					System.out.println("Nhap sai, nhap lai!");
			}
		}
	} while ( chon !=0);
  }
}
