package basics.programs;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter principle amount:");
		int p = n.nextInt();
		System.out.println("Enter no.of months:");
		int m = n.nextInt();
		System.out.println("Enter the rate of interest:");
		int r = n.nextInt();
		float res=p*m*r/100;
		
		System.out.println("Interest amount:"+res);
		
		System.out.println("Enter radius:");
		int ra=n.nextInt();
		System.out.println("Enter pi value:");
		float pi=n.nextFloat();
		
		float output=pi*ra*ra;
		System.out.println("Area of circle:"+output);
		
	}

}
