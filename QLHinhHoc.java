package interface_lab5;

public class QLHinhHoc {

	public static void main(String[] args) {
		HinhChuNhat hcn=new HinhChuNhat(5f,6f);
		HinhHoc hh=new HinhHoc();
		System.out.println("HINH CHU NHAT");
		hh.setChuVi(hcn.TinhChuVi());
		hh.setDienTich(hcn.TinhDienTich());
		hh.xuat();
		System.out.println("HINH TRON");
		HinhTron ht=new HinhTron(2f);

		hh.setChuVi(ht.TinhChuVi());
		hh.setDienTich(ht.TinhDienTich());
		hh.xuat();
		
		

	}

}
