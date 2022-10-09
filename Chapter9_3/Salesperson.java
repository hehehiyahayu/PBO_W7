package Chapter9_3;

public class Salesperson implements Comparable{
	private String firstName, lastName;
	private Integer totalSales;
	
	public Salesperson(String first, String last, int sales) {
		firstName = first;
		lastName = last;
		totalSales = sales;
	}
	
	public String toString() {
		return lastName + ", " + firstName + ": \t" + totalSales;
	}
	
	public boolean equals(Object other) {
		return (lastName.equals(((Salesperson)other).getLastName()) && firstName.equals(((Salesperson)other).getFirstName()));
	}
	
	public int compareTo(Object other) {
//		int result = this.lastName.compareTo(lastName);
//		int result = this.lastName.compareTo(((Salesperson)other).getLastName());
//		int result = this.firstName.compareTo(((Salesperson)other).getFirstName());
		int result;
		
		if(this.totalSales > (((Salesperson)other).getTotalSales())) {
			result = 1;
		}else if(this.totalSales < (((Salesperson)other).getTotalSales())) {
			result = -1;
		}else if(this.totalSales == (((Salesperson)other).getTotalSales())){
			if(this.firstName.compareTo(((Salesperson)other).getFirstName()) > 0) {
				result = 1;
			}else {
				result = -1;
			}
		}else {
			result = 0;
		}
		
		return result;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getTotalSales() {
		return totalSales;
	}
	
}
