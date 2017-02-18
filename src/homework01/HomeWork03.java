package homework01;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		System.out.print("Nhap a:");
		int a = kb.nextInt();
		System.out.print("Nhap b:");
		int b = kb.nextInt();
		System.out.print("Nhap c:");
		int c = kb.nextInt();
		double p = (a+b+c)/2;
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.print("s = " +s );
	}

}
