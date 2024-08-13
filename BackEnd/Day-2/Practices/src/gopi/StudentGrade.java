package gopi;
import java.util.*;


class student{
	int registerNumber;
	String registerName;
	int marks[]=new int[5];
	int sum,avg;
	String grade;
	
	student (int registerNumber,String registerName) {
		this.registerNumber=registerNumber;
		this.registerName=registerName;
	}
	
	void getMark() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks:");
		for(int i=0;i<marks.length;i++) {
			this.marks[i]=sc.nextInt();
		}
		this.calculatorGrade();
	}
	void calculatorGrade() {
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
		}
		avg=sum/(marks.length);
		if(avg<45) {
			this.grade="fail";
		}
		if(avg<45 && avg<65) {
			this.grade="c";
		}
		if(avg<65 && avg<85) {
			this.grade="B";
		}
		if(avg>=85) {
			this.grade="A";
		}
		
	}
	void display() {
		System.out.println("Register Number"+registerNumber+"Name :"+registerName+"Your grade: "+grade);
	}
}

public class grade {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student(24,"gopi");
		s.getMark();
		s.display();

	}

}
