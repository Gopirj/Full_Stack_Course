package program;

public class NewObject {
	 
		String name;
		int age;
	
	NewObject(String name,int age) {
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("Name :"+name+"\n"+"Age :"+age);
	}
	
	public static void main(String args[]) {
		NewObject obj=new NewObject("gopi",20);
		obj.display();
	}
}
