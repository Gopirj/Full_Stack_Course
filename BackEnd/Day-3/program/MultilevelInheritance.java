package program;
class Vehicle {
	void noOfEngine() {
		System.out.println("I have tow Engine");
	}
}
 class TwoWheel extends Vehicle{
	 void noOfWheel() {
		 System.out.println("I have two Wheels");
	 }
 }
class bike extends TwoWheel{
	void brandNames() {
		System.out.println("Brand Name is Honda");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		
				bike obj=new bike();
				obj.noOfEngine();
				obj.noOfWheel();
				obj.brandNames();
			}
}


