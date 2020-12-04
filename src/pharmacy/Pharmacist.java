package pharmacy;

import java.util.ArrayList;
import java.util.Scanner;

public class Pharmacist extends Person {

public void pharmacyDetails() {
		
		int input;
		Scanner scanner = new Scanner(System.in);
		
		//creating an array_list for pharmatists
		ArrayList<Object> pharmacyList = new ArrayList<>();
		
		Pharmacist pharmacist = new Pharmacist();
		
		int id = 1;
		
		do {
			System.out.println("1 - Add new Pharmacist");
			System.out.println("2 - Show all Pharmacist");
			System.out.println("3 - Modify Pharmacist");
			System.out.println("4 - Delete Pharmacist");
			System.out.println("5 - Search a Pharmacist");
			System.out.println("6 - Exit");
			
			input = scanner.nextInt();
			
			//Adding new pharmatists
			if(input == 1) {
		
				pharmacist.setID(id);
				
				System.out.println("enter Pharmacist name");
				String name = scanner.next();
				pharmacist.setName(name);
				
				System.out.println("enter Pharmacist email");
				String email = scanner.next();
				pharmacist.setEmail(email);
				
				System.out.println("enter Pharmacist phone number");
				int phoneNumber = scanner.nextInt();
				pharmacist.setPhoneNumber(phoneNumber);
				
				pharmacyList.add("------------ Pharmacists list --------------------- \n" +
					"Pharmacist id :" + pharmacist.getID() + "\n" +
					"Pharmacist name :" + pharmacist.getName() + "\n" +
					"Pharmacist Email :" + pharmacist.getEmail() + "\n" +
					"Pharmacist Phone Number :" + pharmacist.getPhoneNumber()
						);
				
				id++;
			}
			
			//Displaying all pharmatists
			if (input == 2) {
				for(Object object: pharmacyList) {
					System.out.println(object);
				}
			}
			
			//Modifying a pharmatists
			if (input == 3) {
				System.out.println("enter the Pharmacist id to modify ?");
				int modifyPharmacist = scanner.nextInt();
				
				pharmacist.setID( modifyPharmacist);
				
				 modifyPharmacist =  modifyPharmacist - 1;
				
				System.out.println("enter Pharmacist name");
				String name = scanner.next();
				pharmacist.setName(name);
				
				System.out.println("enter Pharmacist email");
				String email = scanner.next();
				pharmacist.setEmail(email);
				
				System.out.println("enter Pharmacist phone number");
				int phoneNumber = scanner.nextInt();
				pharmacist.setPhoneNumber(phoneNumber);
				
				pharmacyList.set(modifyPharmacist ,"------------ Pharmacists list --------------------- \n" +
					"Pharmacist id :" + pharmacist.getID() + "\n" +
					"Pharmacist name :" + pharmacist.getName() + "\n" +
					"Pharmacist email :" + pharmacist.getEmail() + "\n" +
					"Pharmacist phone number :" + pharmacist.getPhoneNumber() + "\n"
						);
				
			}
			
			//Deleting a pharmatists
			if (input == 4) {
				System.out.println("enter the Pharmacist id to delete ?");
				int deletePharmacist = scanner.nextInt();
				
				pharmacist.setID(deletePharmacist);
                deletePharmacist = deletePharmacist - 1;
                
                pharmacyList.remove(deletePharmacist);
                
			}
			
			//Searching for pharmatists
			if (input == 5) {
				System.out.println("enter the drug id to search for ?");
				int searchPharmacist = scanner.nextInt();
				
				pharmacist.setID(searchPharmacist);
				searchPharmacist = searchPharmacist - 1;
				
				System.out.println(pharmacyList.get(searchPharmacist));
			}
			
			//Return to the main process panel
			if(input == 6) {
				Main.main(null);
			}
			
		}while(input != 6);
		
		scanner.close();
	}
}