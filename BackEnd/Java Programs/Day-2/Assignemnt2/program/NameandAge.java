package program;
class person{
	String name;
	int age;
	
	person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println("Name :"+name+"\n"+"Age :"+age);
	}
}
public class NameandAge {
	public static void main(String args[]) {
		person obj=new person("Gopi",20);
		obj.display();
	}
}
