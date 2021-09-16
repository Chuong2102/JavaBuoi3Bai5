package BaiTap;
import java.util.Scanner;
public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		float a,b;
		float result = 0;
		System.out.println("Nhap a");
		a = input.nextFloat();
		System.out.println("Nhap b");
		b = input.nextFloat();
		//
		if(a == 0) {
			System.out.println("he so a phai khac 0");
		}
		else {
			 result = -b/a;
		}
		System.out.println("Ket qua la`: " + result);
	}

}
