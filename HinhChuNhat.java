package interface_lab5;

public class HinhChuNhat extends HinhHoc {
	private float chieuDai;
	private float chieuRong;
	
	public HinhChuNhat() {}
	public HinhChuNhat(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public float getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}
	public float getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}
	public float TinhChuVi() {
		return (chieuDai+chieuRong)*2;
	}
	public float TinhDienTich() {
		return chieuDai*chieuRong;
	}
	
	

}
