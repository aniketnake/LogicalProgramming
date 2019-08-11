package reversestring;
import java.util.Scanner;
public class Reverse {

 public static void main(String[] args) {
	
	 Scanner scn=new Scanner(System.in);
	 System.out.println("Enter String:");
	 String str=scn.nextLine();
	 
	 StringBuilder s=new StringBuilder(str);
	 
	 System.out.println("Reverse String:");
	 System.out.println(s.reverse().toString());
}

}a
