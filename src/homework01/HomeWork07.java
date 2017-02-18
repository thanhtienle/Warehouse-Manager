package homework01;
import java.util.Scanner;
public class HomeWork07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter score Computer Engineering :");
		int ce=kb.nextInt();
		
		System.out.print("Enter score Computing 1 :");
		int c1=kb.nextInt();
		
		System.out.print("Enter score Practical Computer:");
		int pc=kb.nextInt();
		
		System.out.print("Enter score Software Engineering:");
		int se=kb.nextInt();
		
		System.out.print("Enter score English:");
		int eng=kb.nextInt();
		
		System.out.print("****************************************************************\n");
		System.out.print("      Fullname     :DO THI LAN \n");
		System.out.print("      Class        :CMU CS 303 BIS - DIS\n");
		System.out.print("      Department   :CMU \n");	
		System.out.print("      School year  :2012 – 2013\n");		
		System.out.print("      Scores of subjects in semester one :\n");		
		System.out.print("      Computer Engineering: "+ce + "   Computing 1: "+c1 + "\n");

		System.out.print("      Practical Computer: "+pc + "     Software Engineering: "+se + "\n");
		System.out.print("      English: "+eng + "\n");
		System.out.print("****************************************************************");
		

	}

}
