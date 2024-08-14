package program;

class Employee{
	void work() {
		System.out.println("Employee Details");
	}
	void getSalary() {
		System.out.println("Employee Salary");
	}
}
class HRManager extends Employee{
	void work() {
		System.out.println("HRManager Details");
	}
	void addEmployee(String name) {
		System.out.println("Added Employee name "+name);
	}
}

public class EmployeeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRManager obj=new HRManager();
		obj.work();
		obj.addEmployee("Gopi");
	}

}
