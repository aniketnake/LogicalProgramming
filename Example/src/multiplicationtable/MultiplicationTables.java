package multiplicationtable;

import java.util.Scanner;

public class MultiplicationTables {
	

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int x=scn.nextInt();
		
		for(int y=1;y<=x;y++) {
			
			for (int z=1;z<=10;z++) {
				System.out.println(x+ "*"+z+ "=" +x*z);
				
			}
			
		}
		
	}

}
