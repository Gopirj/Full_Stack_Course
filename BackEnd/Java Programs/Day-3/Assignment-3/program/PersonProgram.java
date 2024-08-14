package program;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employees extends Person {
    private String employeeId;
    private String jobTitle;

    public Employees(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getLastName() {
        return super.getLastName() ;
    }
    public String getjobTitle() {
    	return jobTitle; 
    }
}

public class PersonProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees obj = new Employees("Gopi", "j", "24", "Software Engineer");
        
        System.out.println("First Name: " + obj.getFirstName());
        System.out.println("Last Name: " + obj.getLastName());
        System.out.println("Job Title: "+ obj.getjobTitle());
        System.out.println("Employee ID: " + obj.getEmployeeId());
	}

}
