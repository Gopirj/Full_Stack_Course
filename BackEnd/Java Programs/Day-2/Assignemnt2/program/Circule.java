package program;
import java.util.*;
public class Circule {
	double radius;
	
	Circule(float radius){
		this.radius=radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getCircumference()
	{
		return 2 * Math.PI * radius;
	}
	public static void main(String [] args )
	{
		Circule c1 = new Circule(2.3f);
		System.out.println("Area :"+c1.getArea());
		System.out.println("Circumference :"+c1.getCircumference());
	}
}
