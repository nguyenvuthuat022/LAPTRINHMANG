package Lab5Bai1;

public class ChuNhat {
	
		double dDai;
		double dRong;
		
		public ChuNhat() {}
//-----------------------------------------------------		
		public ChuNhat (double dDai, double dRong) 
		{
			this.dDai = dDai;
			this.dRong = dRong;
		}
//-----------------------------------------------------				
		public double getChuvi ()
		{
			return (this.dDai + this.dRong) *2;
		}
//-----------------------------------------------------		
		public double getDienTich()
		{
			return (this.dDai * this.dRong);
		}
//-----------------------------------------------------		
		public void xuat() {
			System.out.println("Chiều dài: " + this.dDai);
			System.out.println("Chiều rộng: " + this.dRong);
			System.out.println("Chu vi: " + this.getChuvi());
			System.out.println("Diện tích: " + this.getDienTich());
		}
}
