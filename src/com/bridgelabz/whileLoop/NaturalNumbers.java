package com.bridgelabz.whileLoop;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Natural number: ");
		int num = scan.nextInt();
		int i = 1;
		int sum = 0;
		//executes until the condition returns true  
		while(i <= num) {  
		//adding the value of i into sum variable  
		sum = sum + i;  
		//increments the value of i by 1  
		i++;  
		}  
		//prints the sum   
		System.out.println("Sum of the numbers upto given Natural Number is = " + sum);   
	}  
}