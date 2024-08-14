package gopi;

public class Main3 {
	
	void MyMethod1() {
		System.out.println("Instance Method .");
	}

	static void MyMethod2() {
		System.out.println("Static Method .");
	}

	public static void main(String[] args) {
		Main3 obj=new Main3();
		obj.MyMethod1();
		
		Main3.MyMethod2();
		
	}

}
