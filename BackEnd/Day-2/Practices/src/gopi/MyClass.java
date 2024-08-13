package gopi;

public class MyClass {
	 
	 MyClass(String name) {
		System.out.println("Welcome "+name);
	}
	 MyClass(int a,int b) {
		System.out.println("sum :"+(a + b));
	}
	 MyClass(int n) {
		System.out.println("Sum :"+(n + n));
	}
	public static void main(String[] args) {
		
		MyClass obj2=new MyClass("gopi");
		MyClass obj3=new MyClass(10, 20);
		MyClass obj1=new MyClass(5);
	}
}
