
package corejava;
abstract class Car{
	void car() {
		System.out.println("Car is built in");
	}
	abstract void Drive();
}
class Tesla extends Car{

	@Override
	void Drive() {
		System.out.println("Drive Safely");
		
	}
	void GearChange() {
		System.out.println("Gear Changed");
		
	}
	void Speed() {
		System.out.println("Increase speed");
	}
	
}
public class Abstraction {
	public static void main(String[] args) {
	 Tesla ts = new Tesla();
	 ts.car();
	 ts.Drive();
	 ts.GearChange();
	 ts.Speed();
	}

}
