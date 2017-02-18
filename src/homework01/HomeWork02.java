package homework01;
import java.util.Scanner;
public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a radius: ");
		double r = kb.nextDouble();
		double s = Math.PI*r*r;
		double p = 2*Math.PI*r*r;
		System.out.println("Area: "+s);
		System.out.println("Circumference: "+p);
	}

}
