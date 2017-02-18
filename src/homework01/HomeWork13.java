package homework01;

import java.util.Scanner;

public class HomeWork13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter price: ");
		int price = kb.nextInt();
		double tax = 0.0825;
		double taxOut = price*tax;
		double total = taxOut+price;
		System.out.print("Tax: " + taxOut + " $\n");
		System.out.print("Total price: " + total + " $");
	}

}
