
//printing 1 to n numbers
import java.util.Scanner;

public class Pratice01 {
	static Scanner scn = new Scanner(System.in);

	public static void dusriMethod() {
		System.out.println("Limit");
		int n = scn.nextInt();
		System.out.println("numbers");
		for (int i = 0; i <= n; i++) {
			System.out.println(i + " ");
		}

	}

	public static void main(String[] args) {
		Pratice01 pratice = new Pratice01();
		dusriMethod();

	}// main
}// class