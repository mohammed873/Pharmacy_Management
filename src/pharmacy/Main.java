package pharmacy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Drug drug = new Drug();
		Pharmacist pharmacist = new Pharmacist();
		Customer customer = new Customer();
		Scanner scanner = new Scanner(System.in);
		int input;
		
		do {
			System.out.println("1 - Drug Proccess Management");
			System.out.println("2 - Pharmacists Proccess Management");
			System.out.println("3 - Costumers Proccess Management");
			System.out.println("4 - Exit");
			
			input = scanner.nextInt();
			
			switch(input){
			case 1 : 
				drug.drugDetails();
				break;
			case 2 : 
				pharmacist.pharmacyDetails();
				break;
			case 3 : 
				customer.customerDetails();
				break;	
			case 4 : 
				System.out.println("Process not found");
				break;		
			}
			 
		}while(input != 4);
		scanner.close();
	}
}
