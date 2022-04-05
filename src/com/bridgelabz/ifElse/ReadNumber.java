package com.bridgelabz.ifElse;

import java.util.Scanner;

public class ReadNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number from 1,10,100,1000: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		if (a == 1) {
			System.out.println(a + " = Unit");
		} else if (a == 10) {
			System.out.println(a + " = Ten");
		} else if (a == 100) {
			System.out.println(a + " = Hundred");
		} else if (a == 1000) {
			System.out.println(a + " = Thousand");
		} else {
			System.out.println("Enter Number between given numbers");
		}
	}
}