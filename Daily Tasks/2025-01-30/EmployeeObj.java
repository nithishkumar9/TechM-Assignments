package day2;
import day2.Employee;

public class EmployeeObj {
	
	public static void main(String args[]) {
	
		Employee ob1 = new Employee();
		
		ob1.setEmployeeDetails(31, "nithish", 10, 6);
		ob1.getEmployeeDetails();
		ob1.getLoanEligibility();
		
	}
}
