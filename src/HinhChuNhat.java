import java.util.Scanner;

/*
 * Mục đích: xử lí các nghiệp vụ liên quan hình chữ nhật
 * Người tạo: Trần Quốc Cường
 * Ngày tạo: 18/12/2022
 * Version: 1.0
 */
public class HinhChuNhat {
	/*
	 * Các thuộc tính Các phương thức get, set các phương thức khởi tạo Các phương
	 * thức nhập xuất Các phương thức xử lí nghiệp vụ liên quan
	 */

	// 1. Các thuộc tính
	private float chieuDai;
	private float chieuRong;
	private float chuVi;
	private float dienTich;

	// 2. Các phương thức get, set
	public float getChieuDai() {
		return this.chieuDai;
	}

	public void setChieuDai(float cDai) {
		this.chieuDai = cDai;
	}

	public float getChieuRong() {
		return this.chieuRong;
	}

	public void setChieuRong(float cRong) {
		this.chieuRong = cRong;
	}

	public float getChuVi() {
		return this.chuVi;
	}

	public float getDienTich() {
		return this.dienTich;
	}

	// 3. Các phương thức khởi tạo
	public HinhChuNhat() {

	}

	public HinhChuNhat(float cDai, float cRong) {
		this.chieuDai = cDai;
		this.chieuRong = cRong;
	}

	// 4. Các phương thức nhập, xuất
	public void nhap(Scanner scan) {
		System.out.println("\nNhap chieu dai: ");
		this.chieuDai = Float.parseFloat(scan.nextLine());
		System.out.println("\nNhap chieu rong: ");
		this.chieuRong = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("\nHCN(" + chieuDai + "," + chieuRong + ")\tChu vi: " + chuVi + "\tDien tich: " + dienTich);
	}

	// 5. Các phương thức xử lí nghiệp vụ liên quan
	public void tinhChuVi() {
		this.chuVi = (this.chieuDai + this.chieuRong) * 2;
	}

	public void tinhDienTich() {
		this.dienTich = this.chieuDai * this.chieuRong;
	}
}
