package pharmacy;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Person {
	
	private int badge;
	private String status;

	//Constructor
	public Customer(int badge, String status) {
		super();
		this.badge = badge;
		this.status = status;
	}
	
	//Empty Constructor
	public Customer() {
		
	}
	
	
	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}
	
    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	@Override
	public String toString() {
		return "Customer ["+ super.toString() + " " +"badge=" + badge + ", status=" + status + "]";
	}



	Scanner scanner = new Scanner(System.in);
	
	//creating an array_list for pharmatists
	ArrayList<String> customerList = new ArrayList<>();
	int id = 1;


	//Adding new customer
	public void customerAdd() {
		this.setID(id);
		
		//Checking if name char is longer than 6 char
		System.out.println("enter Customer name");
		String name = scanner.next();
		if(name.length() > 6) {
			this.setName(name);
		}else {
			System.out.println("name is too short");
			System.exit(0);
		}
		
		//validating Email
		final String EMAIL_VERIFICATION = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
		System.out.println("enter Customer email");
		String email = scanner.next();
		if(email.matches(EMAIL_VERIFICATION)) {
			this.setEmail(email);
		}else {
			System.out.println("email format is not correct");
			System.exit(0);
		}
		
		System.out.println("enter Customer phone number");
		int phoneNumber = scanner.nextInt();
		this.setPhoneNumber(phoneNumber);
		
		System.out.println("enter the number of bought drugs ?");
		int badge = scanner.nextInt();
		this.setBadge(badge);
		
		//checking customer loyalty
		if(this.getBadge() >= 3) {
			this.setStatus("loyal");
		}else {
			this.setStatus("Not loyal Yet");
		}
		
		customerList.add(this.toString());
		
		id++;
	}

	//Displaying all customers
	public void customerShow() {
		for(String customers: customerList) {
			System.out.println(customers.toString());
		}
	}

	//Modifying a customer
	public void customerModify() {
		
		
		System.out.println("enter the customer id to modify ?");
		int modifyCustomer = scanner.nextInt();
		
		this.setID( modifyCustomer);
		
		modifyCustomer =  modifyCustomer - 1;
		
		System.out.println("enter customer name");
		String name = scanner.next();
		this.setName(name);
		
		System.out.println("enter customer email");
		String email = scanner.next();
		this.setEmail(email);
		
		System.out.println("enter customer phone number");
		int phoneNumber = scanner.nextInt();
		this.setPhoneNumber(phoneNumber);
		
		System.out.println("enter the number of bought drugs ?");
		int badge = scanner.nextInt();
		this.setBadge(badge);
		
		//checking customer loyalty
		if(this.getBadge() >= 3) {
			this.setStatus("loyal");
		}else {
			this.setStatus("Not loyal Yet");
		}
		
		customerList.set(modifyCustomer, this.toString());
	}

	//Deleting a customer
	public void customerDelete() {
		
		System.out.println("enter the Customer id to delete ?");
		int deleteCustomer = scanner.nextInt();
		
		this.setID(deleteCustomer);
		deleteCustomer = deleteCustomer - 1;
        
		customerList.remove(deleteCustomer);
	}

	//Searching for customer
	public void customerSearch() {
		System.out.println("enter the Customer id to search for ?");
		int searchCustomer = scanner.nextInt();
		
		this.setID(searchCustomer);
		searchCustomer = searchCustomer - 1;
		
		System.out.println(customerList.get(searchCustomer));
	}
	
public void customerDetails() {
		
		int input;
	
		
		
		do {
			System.out.println("1 - Add new Customer");
			System.out.println("2 - Show all Customer");
			System.out.println("3 - Modify Customer");
			System.out.println("4 - Delete Customer");
			System.out.println("5 - Search a Customer");
			System.out.println("6 - Excit");
			
			input = scanner.nextInt();
			
			switch(input){
			case 1 : 
				customerAdd();
				break;
			case 2 : 
				customerShow();
				break;
			case 3 : 
				customerModify();
				break;	
			case 4 : 
				customerDelete();
				break;
			case 5:
				customerSearch();
				break;
			case 6:
				Main.main(null);
				break;
			}
			
		}while(input != 7);
		
		scanner.close();
	}
}


