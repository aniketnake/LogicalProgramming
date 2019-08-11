// Example of compile time polymorphism
public class Addition_CTP {
	public  int add(int a, int b) {
		return a+b;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Addition_CTP addition =new Addition_CTP();
	
	
		System.out.println("Addtion of double"+addition.add(20.6, 20.6)); 
		System.out.println("Addtion of integer"+addition.add(20, 20)); 
	}
}
