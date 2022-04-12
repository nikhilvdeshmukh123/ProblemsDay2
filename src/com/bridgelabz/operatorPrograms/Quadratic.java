package com.bridgelabz.operatorPrograms;

/*
 * @author: Nikhil
 * Take a, b, and c as input values to find the roots of x.
 */
public class Quadratic {

	static void findRoots(int a, int b, int c) {
		// If a is 0, then equation is not
		// quadratic, but linear

		if (a == 0) {
			System.out.println("Invalid");
			return;
		}

		int d = b * b - 4 * a * c;
		double sqrt_val = sqrt(abs(d));

		if (d > 0) {
			System.out.println("Roots are real and different \n");

			System.out.println((double) (-b + sqrt_val) / (2 * a) + "\n" + (double) (-b - sqrt_val) / (2 * a));
		} else if (d == 0) {
			System.out.println("Roots are real and same \n");

			System.out.println(-(double) b / (2 * a) + "\n" + -(double) b / (2 * a));
		} else // d < 0
		{
			System.out.println("Roots are complex \n");

			System.out.println(
					-(double) b / (2 * a) + " + i" + sqrt_val + "\n" + -(double) b / (2 * a) + " - i" + sqrt_val);
		}
	}
	// Driver code
	private static double sqrt(Object abs) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static Object abs(int d) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = -7, c = 12;

		// Function call
		findRoots(a, b, c);
	}
}