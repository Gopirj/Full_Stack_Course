package program;

class MyClass {
	void noOfWheelers() {
		System.out.println("I have tow wheels");
	}
}
class Biker extends MyClass{
	void brandName() {
		System.out.println("Brand Name is Honda");
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biker obj=new Biker();
		obj.noOfWheelers();
		obj.brandName();
	}

}
