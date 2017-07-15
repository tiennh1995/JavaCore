package lecture3;

import java.awt.Point;

public class TestException {
	public static void main(String[] args) {
//		System.out.println("Goi phuong thuc methodX()");
//		try {
//			methodX();
//		} catch(NullPointerException e) {
//			System.out.println("Loi NULL Object!");
//		}
//		System.out.println("Chuong trinh ket thuc binh thuong");
		
		
		
		System.out.println("Goi phuong thuc A()");
		try {
			A();
		} catch(ArithmeticException e) {
			System.out.println("Loi chia cho 0");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Loi vuot qua so luong mang");
		}
		System.out.println("Chuong trinh ket thuc binh thuong");
	}
	
	public static void methodX() {
		Point[] pts = new Point[10];
		for (int i = 0; i < pts.length; i++) {
			pts[i].x = i;
			pts[i].y = i + 1;
		}
	}
	
	public static void A() {
		B();
	}
	
	public static void B() {
		try {
			C();
		} catch(Exception e) {
			System.out.println("Loi vuot qua kich thuoc mang, nam trong method C()");
//			throw e;
		}
	}
	
	public static void C() throws Exception{
		try {
			int[] array = new int[10];
			int x = array[10];
			x = x + 1;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.gc();
			throw e;
		}
	}
}
