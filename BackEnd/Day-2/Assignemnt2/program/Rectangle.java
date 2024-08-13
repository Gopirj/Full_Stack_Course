package program;

public class Rectangle {
	float width;
	float height;
	
	Rectangle(float width,float height){
		this.width=width;
		this.height=height;
		this.area(width,height);
	}
	public void area(float width,float height) {
		float area=width*height;
		System.out.println("Area :"+area);
		this.perimeter(width,height);
	}
	public void perimeter(float width,float height) {
		float perimeter=(2*width)+(2*height);
		System.out.println("Perimeter :"+perimeter);
	}
	public static void main(String args[]) {
		Rectangle obj=new Rectangle(12.3f,10.3f);
	}
}
