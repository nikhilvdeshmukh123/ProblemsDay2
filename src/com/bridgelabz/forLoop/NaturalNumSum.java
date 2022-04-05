package com.bridgelabz.forLoop;

import java.util.Scanner;

public class NaturalNumSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Natural number: ");
		int num = scan.nextInt();
		int i = 1;
		int sum = 0;

	        for (i = 1; i <= num; i++) {
	            sum = sum + i;
	       }
		System.out.println("Sum of numbers upto given natural number: " + sum);
	}
}