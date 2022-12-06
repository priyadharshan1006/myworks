package week2.day1Assignment;

public class EmployeeDetails {
	public void printEmployeeName() {
		String employeeName = "sam";
		System.out.println(employeeName);
		int employeeId = 15;
		System.out.println(employeeId);}
	public void getEmployeeAddress() {
		String employeeAddress = "11/234 jj.nagar mogappair east chennai";
		System.out.println(employeeAddress);
	}
	public void printEmployeeSalary() {
		int employeeSalary = 200000;
		System.out.println(employeeSalary );}
	public void printEmployeeNumber () {
		long employeeNumber = 6678331302l;
		System.out.println(employeeNumber);
	}
	public static void main(String[] args) {
	EmployeeDetails employee = new EmployeeDetails();
	employee.printEmployeeName();
	employee.getEmployeeAddress();
	employee.printEmployeeSalary();
	employee.printEmployeeNumber();
	
	}
}
