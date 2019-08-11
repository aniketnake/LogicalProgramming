//Armstrong number
package armtrong;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//variable declaration
		int num, number, temp, total = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		num = scn.nextInt();
		
		number = num;
		for (; number != 0; number /= 10) {
			temp = number % 10;
			total = total + temp * temp * temp;
		}
		if (total == num)
			System.out.println(num + "is armstrong number");
		else
			System.out.println(num + "is not armstrong number");
	}
	
}
