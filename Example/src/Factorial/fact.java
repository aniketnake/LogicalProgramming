package Factorial;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		int fact = 1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		int x = scn.nextInt();

		for (int i = 1; i <= x; i++) {
			fact = fact * i;
		}//for
		System.out.println(fact);
	}//main
}//class
