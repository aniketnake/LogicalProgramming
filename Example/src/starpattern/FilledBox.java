package starpattern;

import java.util.Scanner;

public class FilledBox {

	public static void main(String[] args) {
		int i,j;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter value");
		int x=scn.nextInt();
		
		for(i=0;i<x;i++) {
			System.out.println("");
			for(j=0;j<x;j++) {
				System.out.print("*");
			}
		}
		System.out.print("\n");
	}

}
