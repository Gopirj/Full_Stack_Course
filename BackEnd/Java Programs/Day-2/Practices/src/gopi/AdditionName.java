package gopi;


//this keyword in java
public class Main {
	String name;
	Main(String name){
		this(10,20);
		this.name=name;
		this.greeting();
	}
	Main(int a, int b){
		System.out.println("Addition : "+(a+b));
	}
	void greeting() {
		System.out.println("Welcome  "+ name);
	}
	public static void main(String[] args) {
	Main4 obj =new Main ("Jeeva");
	} 

}
