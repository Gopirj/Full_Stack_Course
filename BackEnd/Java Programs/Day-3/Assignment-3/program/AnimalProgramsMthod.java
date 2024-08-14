package program;

class Animal1{
	void move() {
		System.out.println("this is Animal");
	}
}
class Cheetah extends Animal1 {
	void move() {
		System.out.println("This is Cheeta");
	}
}
public class AnimalProgramsMthod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 obj=new Cheetah();
		obj.move();
	}

}
