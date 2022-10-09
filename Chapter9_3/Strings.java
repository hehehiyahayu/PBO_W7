package Chapter9_3;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		Integer size;
		String valueScan;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nHow many string do you want to sort? ");
		size = scan.nextInt();
		String [] stringList = new String[size];
		
		System.out.println("\nEnter the strings...");
		for(int i = 0; i < size; i++) {
			valueScan = scan.next();
			stringList[i] = new String(valueScan);
		}
		
//		Sorting.selectionSort(stringList);
		Sorting.insertionSort(stringList);
		
		System.out.println("\nYour strings in sorted order...");
		for(int i = 0; i < size; i++) {
			System.out.println(stringList[i] + "  ");
		}
		System.out.println();
		
		scan.close();
	}
}
