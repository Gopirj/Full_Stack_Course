package program;

class Shape{
	void getArea(int l,int b) {
		System.out.println("Rectangle Area");
	}
}
class Rectangle extends Shape{
	void getArea(int l,int b) {
		System.out.println("Rectangle values :"+(l*b));
	}
}

public class ShapeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj=new Rectangle();
		obj.getArea(4,2);
	}

}
