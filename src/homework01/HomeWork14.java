package homework01;

import java.util.Scanner;

public class HomeWork14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter inch(es): ");
		double in = kb.nextDouble();
		double cm = in/0.39370;
		System.out.print("= " + cm + " in");
		
	}

}
