package Lab4;

public class HangHoa {
	private String tenHH;
	private double donGia;
	private double giamGia;
//	Xây dựng các hàm khơi tạo
//	Khỏi tạo giá trị ban đầu cho các thuộc tính
//	được gọi khi ta khai báo, xong mới 1 đối tượng của lớp này
	
	public HangHoa() {}
	
	public HangHoa(String tenHH, double donGia, double giamGia) {
		this.tenHH = tenHH;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	public HangHoa(String tenHH, double donGia) {
		this.tenHH = tenHH;
		this.donGia = donGia;
		this.giamGia = 0;
	}
	
	public void xuatHH()
		{
			System.out.println("Tên Sản Phẩm: " + tenHH);
			System.out.println("Gía Sản Phẩm: " + String.valueOf(donGia));
			System.out.println("Giảm giá: " + String.valueOf(giamGia));
		}
	
//	Xây dựng các setter (các phương thức gán dữ liệu cho thuộc tính)
//	Xây dựng các getter
	
//--------------------------------------------	
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
//------------------------------------------
	public String getTenHH() {
		return tenHH;
	}
	public void setTenHH(String tenHH) {
		this.tenHH = tenHH;
	}
//-----------------------------------------
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	
	
}
	

