package program;

class Vehicle{
	void drive() {
		System.out.println("Reparing a Vehicle");
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Reparing a Car");
	}
}

public class VehicleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj=new Car();
		obj.drive();
	}

}
