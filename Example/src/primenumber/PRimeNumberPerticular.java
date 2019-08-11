//Prime number
package primenumber;

//import java.util.Scanner;

public class PRimeNumberPerticular {

	public static void main(String[] args) {
		int a=10;
		int temp=0;
		
		for(int i=2;i<=a-1;i++) {
			if(a%i==0) {
				temp=temp+1;
				
			}
		}
			if(temp==0) 
				System.out.println("number is prime no");
			else 
				System.out.println("number is not prime numbers");
			
		
		
		
		
	}

}
