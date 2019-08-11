
public class Test extends Example01 {
	
	
	
	void A(int x) {
		System.out.println("the method is overloaded");
	}
	static  void B() {
		System.out.println("theB() method is overrided");
	}

	public static void main(String[] args) {
		 
		//Test t =new Test();
		Example01 e=new Example01();
		Example01 ee=new Test();
	Test t=new Test();
	t.A();
		ee.A();
		B();
	//	Test.A();
		Example01.B();
		//Test.A(10);

	}

}
