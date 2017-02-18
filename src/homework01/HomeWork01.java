package homework01;
import java.util.Scanner;
public class HomeWork01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		System.out.print("Enter The Value For X:");
		int x = kb.nextInt();
		double z = Math.exp(x + Math.sin(2*x)- Math.pow(x,5));
		System.out.print("Z = "+z);
	}

}
