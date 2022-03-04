package Lab5Bai1;

public class Vuong extends ChuNhat{

	double dCanh;
	public Vuong() { super(); }
	
	public Vuong(double dCanh) {
		super(dCanh,dCanh);
		this.dCanh = dCanh;
	}

	@Override
	public void xuat() {
		System.out.println("Cạnh: " + dCanh);
		System.out.println("Chu vi: " + super.getChuvi());
		System.out.println("Diện tích: " + super.getDienTich());
	}
	
	

}
