import java.util.Scanner;
public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		HinhChuNhat hcn = new HinhChuNhat();
		hcn.nhap(scan);
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hcn.xuat();
	}

}
