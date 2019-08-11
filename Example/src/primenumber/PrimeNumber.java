package primenumber;

import java.util.Scanner;

public class PrimeNumber {
	private static Scanner sc;

	public static void main(String[] args) {
		
		
			int number, minimum, maximum, i, count; 
			sc = new Scanner(System.in);
			
			System.out.print(" Please Enter the Minimum value : ");
			minimum = sc.nextInt();	
			
			System.out.print(" Please Enter the Maximum value : ");
			maximum = sc.nextInt();	
			
		
			System.out.println(" Prime Numbers from\t" +minimum+ "\tto\t" +maximum+ "are : ");	
			for(number = minimum; number <= maximum; number++)
			{
				count = 0;
			    for (i = 2; i <= number/2; i++)
			    {
			    	if(number % i == 0)
			    	{
			    		count++;
			    		break;
			    	}
			    }
			    if(count == 0 && number != 1 )
			    {
			    	System.out.print(number + " ");
			    }  
			}
		}
}
