package com.bridgelabz.forLoop;

import java.util.Scanner;

public class ReverseIntegerNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Integer number to Reverse: ");
		int number = scan.nextInt();
		int reverse = 0;

		for (; number != 0; number /= 10) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
		}

		System.out.println("Reversed Number: " + reverse);
	}
}