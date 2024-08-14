package gopi;

public class java {
	
	int b=20; //Instance or object variable
	static int c=30; //Static or class variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; //Local variable
		System.out.println("Local variable :"+a);
		
		java obj = new java();
		System.out.println(obj.b);
		
		System.out.println(c);
	}

}
