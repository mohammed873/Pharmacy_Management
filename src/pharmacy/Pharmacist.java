package pharmacy;

import java.util.ArrayList;
import java.util.Scanner;

public class Pharmacist extends Person {

//Contractor
public Pharmacist() {
		super();
	}

Scanner scanner = new Scanner(System.in);

//creating an array_list for pharmatists
ArrayList<String> pharmacyList = new ArrayList<>();
int id = 1;


//Adding new pharmacist
public void pharmacyAdd() {
	this.setID(id);

	//Checking if name char is longer than 6 char
	System.out.println("enter Pharmacist name");
	String name = scanner.next();
	if(name.length() > 6) {
		this.setName(name);
	}else {
		System.out.println("name is too short");
		System.exit(0);
	}
	
	//validating Email
	final String EMAIL_VERIFICATION = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
	System.out.println("enter Pharmacist email");
	String email = scanner.next();
	if(email.matches(EMAIL_VERIFICATION)) {
		this.setEmail(email);
	}else {
		System.out.println("email format is not correct");
		System.exit(0);
	}
	
	
	System.out.println("enter Pharmacist phone number");
	int phoneNumber = scanner.nextInt();
	this.setPhoneNumber(phoneNumber);

	pharmacyList.add(this.toString());
	
	id++;
}

//Displaying all pharmatists
public void pharmacyShow() {
	for(String pharmacist1: pharmacyList) {
		System.out.println(pharmacist1.toString());
	}
}

//Modifying a pharmatists
public void pharmacyModify() {
	System.out.println("enter the Pharmacist id to modify ?");
	int modifyPharmacist = scanner.nextInt();
	
	this.setID( modifyPharmacist);
	
	 modifyPharmacist =  modifyPharmacist - 1;
	
	//Checking if name char is longer than 6 char
		System.out.println("enter Pharmacist name");
		String name = scanner.next();
		if(name.length() > 6) {
			this.setName(name);
		}else {
			System.out.println("name is too short");
			System.exit(0);
		}
	
	//validating Email
		final String EMAIL_VERIFICATION = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
		System.out.println("enter Pharmacist email");
		String email = scanner.next();
		if(email.matches(EMAIL_VERIFICATION)) {
			this.setEmail(email);
		}else {
			System.out.println("email format is not correct");
			System.exit(0);
		}
		
	System.out.println("enter Pharmacist phone number");
	int phoneNumber = scanner.nextInt();
	this.setPhoneNumber(phoneNumber);
	
	pharmacyList.set(modifyPharmacist, this.toString());
}

//Deleting a pharmatists
public void pharmacyDelete() {
	System.out.println("enter the Pharmacist id to delete ?");
	int deletePharmacist = scanner.nextInt();
	
	this.setID(deletePharmacist);
    deletePharmacist = deletePharmacist - 1;
    
    pharmacyList.remove(deletePharmacist);
}

//Searching for pharmatists
public void pharmacySearch() {
	System.out.println("enter the drug id to search for ?");
	int searchPharmacist = scanner.nextInt();
	
	this.setID(searchPharmacist);
	searchPharmacist = searchPharmacist - 1;
	
	System.out.println(pharmacyList.get(searchPharmacist));
}

public void pharmacyDetails() {
		
		int input;
		
		do {
			System.out.println("1 - Add new Pharmacist");
			System.out.println("2 - Show all Pharmacist");
			System.out.println("3 - Modify Pharmacist");
			System.out.println("4 - Delete Pharmacist");
			System.out.println("5 - Search a Pharmacist");
			System.out.println("6 - Exit");
			
			input = scanner.nextInt();
			
			switch(input){
			case 1 : 
				pharmacyAdd();
				break;
			case 2 : 
				pharmacyShow();
				break;
			case 3 : 
				pharmacyModify();
				break;	
			case 4 : 
				pharmacyDelete();
				break;
			case 5:
				pharmacySearch();
				break;
			case 6:
				Main.main(null);
				break;
			}
		}while(input != 6);
		
		scanner.close();
	}
}