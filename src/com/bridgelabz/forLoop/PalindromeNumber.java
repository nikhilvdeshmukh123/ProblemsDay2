package com.bridgelabz.forLoop;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		String original;
		String reverse = "";
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number to check if it is a palindrome");
		original = scan.nextLine();
		int length = original.length();
		int i = 0;
		for (i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered number is a palindrome.");
		else
			System.out.println("Entered number is not a palindrome.");
	}
}