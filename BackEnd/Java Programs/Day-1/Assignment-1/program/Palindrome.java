package program;
import java.util.*;
public class Palindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder s=new StringBuilder(str);
		String str1=s.reverse().toString();
		if(str.equals(str1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not Palindrome");
		}
	}
}
