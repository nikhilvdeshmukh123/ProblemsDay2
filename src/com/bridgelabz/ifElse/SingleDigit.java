package com.bridgelabz.ifElse;

import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {

		System.out.println("Enter a single digit number: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		if (a == 1) {
			System.out.println(a + " = One");
		} else if (a == 2) {
			System.out.println(a + " = Two");
		} else if (a == 3) {
			System.out.println(a + " = Three");
		} else if (a == 4) {
			System.out.println(a + " = Four");
		} else if (a == 5) {
			System.out.println(a + " = Five");
		} else if (a == 6) {
			System.out.println(a + " = Six");
		} else if (a == 7) {
			System.out.println(a + " = Seven");
		} else if (a == 8) {
			System.out.println(a + " = Eight");
		} else if (a == 9) {
			System.out.println(a + " = Nine");
		} else {
			System.out.println("Enter valid single digit number");
		}
	}
}