
public class Example01 {
	
	private int a=10;
	
	 void A() {
		System.out.println("non static method A is called");
		B();
	}
	
	static void B() {
		System.out.println(" static method B is called");
	}
	
	void getValue(int a) {
		this.a=a;
	}
	void setValue() {
		System.out.println(a);
	}
}

