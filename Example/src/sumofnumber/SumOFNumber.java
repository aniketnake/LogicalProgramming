package sumofnumber;

import java.util.Scanner;

public class SumOFNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter value");
		int x = scn.nextInt();
		int sum = 0;

		for (int i = 1; i <= x; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
