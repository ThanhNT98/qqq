package interface_lab5;

import java.util.Scanner;

public class Shape{
	public static void main(String[] args) {
		HinhCN hcn=new HinhCN();
		hcn.nhap();
		hcn.TinhChuVi();
		hcn.TinhDienTich();
		hcn.XemThongTin();
	}
}

interface IHinh {
	float TinhChuVi();
	float TinhDienTich();
	void XemThongTin();
}
class HinhCN implements IHinh{
	 public float chieuDai;
	 public float chieuRong;
	 
	 public HinhCN() {}
	 public HinhCN(float chieuD, float chieuR) {
		 this.chieuDai=chieuD;
		 this.chieuRong=chieuR;
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
	public void XemThongTin() {
		System.out.println("Chu vi HCN: "+TinhChuVi());
		System.out.println("Dien tich HCN: "+TinhDienTich());
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap chieu dai HCN: ");
		chieuDai=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap chieu rong HCN: ");
		chieuRong=Float.parseFloat(sc.nextLine());
	}
	
	
	
	 
 }
