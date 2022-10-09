package Chapter9_1;

public class Employee extends StaffMember{
	protected String socialSecurityMember;
	protected double payRate;
	
	public Employee (String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone);
		
		socialSecurityMember = socSecNumber;
		payRate = rate;
	}
	
	public String toString() {
		String result = super.toString();
		
		result += "\nSocial Security Number: " + socialSecurityMember;
		
		return result;
	}
	
	public double pay() {
		return payRate;
	}
}
