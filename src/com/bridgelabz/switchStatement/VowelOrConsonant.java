package com.bridgelabz.switchStatement;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		boolean isVowel;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char character = scan.next().charAt(0);
		scan.close();
		switch (character) {
		case 'a':
			isVowel = true;
			break;
		case 'e':
			isVowel = true;
			break;
		case 'i':
			isVowel = true;
			break;
		case 'o':
			isVowel = true;
			break;
		case 'u':
			isVowel = true;
			break;
		case 'A':
			isVowel = true;
			break;
		case 'E':
			isVowel = true;
			break;
		case 'I':
			isVowel = true;
			break;
		case 'O':
			isVowel = true;
			break;
		case 'U':
			isVowel = true;
			break;
		default:
			isVowel = false;
		}
		if (isVowel == true) {
			System.out.println(character + " is  a Vowel");
		} else {
			if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
				System.out.println(character + " is a Consonant");
			else
				System.out.println("Input is not an alphabet");
		}
	}
}