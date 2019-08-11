package FindingArrayLengthWithoutLengthMethod;

public class FindLength {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int length = length(a);
		System.out.println(length);
	}

	public static int length(int[] a) {

		int count = 0;
		for (int i : a) {

			count++;

		}

		return count;

	}

}
