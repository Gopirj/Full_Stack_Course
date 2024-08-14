package program;

//Subclass called to parent class method is overried
class Animal{
	void makeSound() {
		System.out.println("Animal Sound");
	}
}
class Cat extends Animal{
	
	void makeSound() {
		System.out.println("meow");
//		called to parent class using super method
		super.makeSound();
	}
}
public class AnimalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj=new Cat();
		obj.makeSound();
	}

}
