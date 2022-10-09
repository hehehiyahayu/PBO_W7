package Chapter9_3;

import java.util.Scanner;

public class WeeklySales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Salesperson[] salesStaff = new Salesperson[10];
		Salesperson[] salesStaff;
		String firstName, lastName;
		int totalSale;
		int size;
		
//		salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
//		salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
//		salesStaff[2] = new Salesperson("James", "Jones", 3000);
//		salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
//		salesStaff[4] = new Salesperson("Don", "Trump", 1570);
//		salesStaff[5] = new Salesperson("Jane", "Black", 3000);
//		salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
//		salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
//		salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
//		salesStaff[9] = new Salesperson("Walt", "Smith", 3000);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nHow many employees do you want to sort? ");
		size = scan.nextInt();
		salesStaff = new Salesperson[size];
		
		System.out.println("\nEnter the employee's data...");
		for(int i = 0; i < size; i++) {
			System.out.println("\nEnter the employee's first name: ");
			firstName = scan.next();
			System.out.println("\nEnter the employee's last name: ");
			lastName = scan.next();
			System.out.println("\nEnter the employee's total sales: ");
			totalSale = scan.nextInt();
			salesStaff[i] = new Salesperson(firstName, lastName, totalSale);
		}
		
		scan.close();
		
		Sorting.insertionSort(salesStaff);
//		Sorting.selectionSort(salesStaff);
		
		System.out.println("\nRanking of Sales for the Week\n");
		
		for(Salesperson s: salesStaff)
			System.out.println(s);
	}

}
