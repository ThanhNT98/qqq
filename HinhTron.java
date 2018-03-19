package interface_lab5;

public class HinhTron extends HinhHoc {
	private float banKinh;
	
	public HinhTron() {}
	public HinhTron(float banKinh) {
		this.banKinh = banKinh;
	}
	public float getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(float banKinh) {
		this.banKinh = banKinh;
	}
	public float TinhChuVi() {
		return (float) (2*3.14*banKinh);
	}
	public float TinhDienTich() {
		return (float) (3.14*banKinh*banKinh);
	}
	
	
	
}
