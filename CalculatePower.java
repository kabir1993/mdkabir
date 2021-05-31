package pSolve;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number ");
		double a = in.nextDouble();
		System.out.println("Please enter a number to the power ");
		double b = in.nextDouble();
		double result = Math.pow(a, b);
		
		System.out.println("The power of the number is " + result);
		

	}

}
