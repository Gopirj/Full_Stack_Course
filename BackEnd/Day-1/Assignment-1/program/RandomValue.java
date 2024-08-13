package program;
import java.util.*;
public class RandomValue {
	public static void main(String args[]) {
		Random a= new Random();
		int n=a.nextInt(0,5);
		System.out.println(n);
	}
}
