package Reversenaturalnumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("limit:");
		int x = scn.nextInt();
		System.out.println("number");
		for (int i = x; i >= 1; i--) {
			System.out.println(i + " ");
		}
	}

}
