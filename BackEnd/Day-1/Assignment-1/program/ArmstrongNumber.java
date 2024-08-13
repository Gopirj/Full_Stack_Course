package program;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String args[]) {
		int rev=0,n=0,c=0;
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			c++;
		}
		int nums=num;
		while(num>0) {
			rev=num%10;
			num=num/10;
			n=rev*c;
		}
		if(nums==n) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}
}
