package program;
class Vehicles {
	void noOfEngine() {
		System.out.println("I have tow Engine");
	}
}
 class TwoWheelers extends Vehicles{
	 void noOfWheel() {
		 System.out.println("I have two Wheels");
	 }
 }
class bikes extends TwoWheelers{
	void brandNames() {
		System.out.println("Brand Name is Honda");
	}
}
class Scooty extends TwoWheelers{
	void brandName() {
		System.out.println("Brand Name is Activa");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bikes obj=new bikes();
		obj.noOfEngine();
		obj.noOfWheel();
		obj.brandNames();
		
		Scooty scooty = new Scooty();
		scooty.noOfEngine();
		scooty.noOfWheel();
		scooty.brandName();
		
	}
	}


