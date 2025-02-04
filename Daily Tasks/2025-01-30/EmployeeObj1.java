package training;
import training.Employee;

public class EmployeeObj1 {
	
	public static void main(String args[]) {
	
		Employee ob1 = new Employee();
		
		ob1.setEmployeeDetails(31, "nithish", 10, 6);
		ob1.getEmployeeDetails();
		ob1.getLoanEligibility();
		
	}
}
