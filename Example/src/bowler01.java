// Example of run time polymorphism (overriding)
public class bowler01 extends Bowler {
	public void bowlerType() {
		System.out.println("Fast Bowler");
	}

	public static void main(String[] args) {
			Bowler b=new bowler01();
			b.bowlerType();
	}

}
