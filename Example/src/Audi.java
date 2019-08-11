//Example of interface 
public class Audi implements CarWorkinh{
	int gear=1;
	int speed =0;
	
	
	/*
	 * 
	 */
	@Override
	public void changeGear(int value) {
		gear=value;
	}
	
	public void speedUp(int increment) {
		speed=speed+increment;
	}
	
	public void appliedBreak(int decrement) {
		speed=speed-decrement;
	}
	
	public void printStatus(){
		System.out.println("Gear:"+gear+"speed:"+speed);
	}
	public static void main(String[] args) {
		Audi a6=new Audi();
		a6.ChangeGear(3);
		a6.printStatus();
		a6.SpeedUp(50);
		a6.AppliedBreak(20);
		a6.printStatus();
	}

}
