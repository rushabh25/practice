
public class Employee implements Comparable<Employee>{
	private double employeeNumber;
	private String firstName;
	private String lastName;
	private String emailId;
	
	public Employee(double employeeNumber){
		this.employeeNumber = employeeNumber;
		this.firstName = null;
		this.lastName = null;
		this.emailId = null;
	}

	public void setEmployeeNumber(double employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmailId(String emailId){
		this.emailId = emailId;
	}
	
	public double getEmployeeNumber() {
		return this.employeeNumber;
	}
	
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}
	
	public String getEmailId() {
		return this.emailId;
	}

	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
		Double emp1 = new Double(this.employeeNumber);
		Double emp2 = new Double(other.employeeNumber);
		
		return emp1.compareTo(emp2);
	}
}
