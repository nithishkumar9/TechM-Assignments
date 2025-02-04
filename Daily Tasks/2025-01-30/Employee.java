package training;

public class Employee {
	
	private int empId;
	private String empName;
	private double sal;
	private int exp;
	
	
	void setEmployeeDetails(int empId, String empName, double sal, int exp) {
		this.empId=empId;
		this.empName=empName;
		this.sal=sal;
		this.exp=exp;
	}
	
	void getEmployeeDetails() {
		System.out.println("Employee Details:");
		System.out.println("ID: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+sal);
		System.out.println("Experience(in Years): "+exp+"\n");
	}
	
	void getLoanEligibility(){
		if (exp>5) {
			if(sal==6) {
				System.out.println("2 lakhs of loan is granted.");
			}else if(15>sal && sal>=10) {
				System.out.println("5 lakhs of loan is granted.");
			}
			else if(sal>=15) {
				System.out.println("7 lakhs of loan is granted.");
			}
			else {
				System.out.println("Not eligible to get loan because your salary is less than 6 Lakhs.");
			}
		} else {
			System.out.println("Not eligible to get loan because your experience is less than or equal to 5.");
		}
	}
}
