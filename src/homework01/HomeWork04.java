package homework01;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		System.out.print("Enter length: ");
		int l = kb.nextInt();
		double g=9.18;
		double t = 2*Math.PI*Math.sqrt(l/g);
		System.out.print("t = " +t);
	}

}
