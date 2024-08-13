package program;

import java.util.Scanner;

public class ASCIIValue {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);
		int n=s;
		System.out.println("ASCII value: "+n);
	}
}
