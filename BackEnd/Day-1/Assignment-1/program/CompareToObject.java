package program;

import java.util.Scanner;

public class CompareToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n1=sc.next();
		String n2=sc.next();
		if(n1.equals(n2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}

}
