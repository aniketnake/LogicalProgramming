package Array;

public class ArrayList {
	public static void main(String[] args) {
		//take array and declare variable
		int ar[] = { 2, 4, 6, 8, 10, 1, 5 };
		int temp = 0;
		int length1 = 0;
		length1 = ar.length -1;
		//swapping
		for (int i = 0; i < length1 / 2; i++) {
			temp = ar[i];
			ar[i] = ar[ar.length - 1 - i];
			ar[ar.length - 1 - i] = temp;

		}//for
		for (int j = 0; j < ar.length - 1; j++) {
			System.out.println(ar[j]);
		}//for
	}//main
}//class
