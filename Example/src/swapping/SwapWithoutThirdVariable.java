//swapping 
package swapping;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		System.out.println("Before Swaping");
		int x=10;
		int y=20;
		System.out.println("x is"+x);
		System.out.println("y is"+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping");
		System.out.println("x is"+x);
		System.out.println("y is"+y);
	}

}
