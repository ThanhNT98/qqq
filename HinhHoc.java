package interface_lab5;

public class HinhHoc {
	protected float chuVi;
	protected float dienTich;
	
	public float getChuVi() {
		return chuVi;
	}
	public void setChuVi(float chuVi) {
		this.chuVi = chuVi;
	}
	public float getDienTich() {
		return dienTich;
	}
	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}
	public void xuat() {
		System.out.println("Chu vi: "+getChuVi());
		System.out.println("Dien tich: "+getDienTich());
	}
	

}
