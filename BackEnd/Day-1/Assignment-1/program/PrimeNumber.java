package program;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c==1) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
	}

}
