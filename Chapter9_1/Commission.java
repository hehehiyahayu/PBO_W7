package Chapter9_1;

public class Commission extends Hourly {
	private double totalSales;
	private double commissionRate;
	
	public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double eCommissionRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		
		commissionRate = eCommissionRate;
	}
	
	public void addSales (double eTotalSales) {
		totalSales += eTotalSales;
	}
	
	public double pay() {
		double payment = super.pay() + totalSales;
		
		payment =  payment * commissionRate / 100;
		
		totalSales = 0;
		
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		
		result += "\nCurrent total sales: " + totalSales;
		
		return result; 
	}
}
