package starpattern;

public class ReverseRightAngleTriangle {
	static int i, j, n = 3;

	public static void main(String[] args) {
		for (i = 1; i <= n; i++) {
		
			for (j = 1; j <= n; j++) {
				if (i == 1 && j == 2 || i == 1 && j == 3 || i == 2 && j == 3) {
					System.out.println("*");

			} else {
					System.out.print("b");
				}
			}

		}
	}

}
