

import java.util.Scanner;

public class AreaOfTraiAngle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Height and Base of first TraiAngle");
		double h1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		System.out.println("Enter the Height and Base of Second TraiAngle");
		double h2 = sc.nextDouble();
		double b2 = sc.nextDouble();
		System.out.println("Area of First traiangle : " + (h1 * b1) / 2);
		System.out.println("Area of second traiangle : " + (h2 * b2) / 2);
		System.out.println("Area of both traiangle together : " + ((h1 * b1) / 2 + (h2 * b2) / 2));
		if ((h1 * b1) / 2 > (h2 * b2) / 2)
			System.out.println("gereter area " + (h1 * b1) / 2 + " of 1st traiangle");
		else
			System.out.println("gereter area " + (h2 * b2) / 2 + " of 2nd traiangle");
	}

}   
