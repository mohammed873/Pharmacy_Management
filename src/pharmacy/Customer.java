package pharmacy;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Person {
	
	private int badge;
	private String status;

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

public void customerDetails() {
		
		int input;
		Scanner scanner = new Scanner(System.in);
		
		//creating an array_list for pharmatists
		ArrayList<Object> customersList = new ArrayList<>();
		
		Customer customer = new Customer();
		
		int id = 1;
		
		do {
			System.out.println("1 - Add new Customer");
			System.out.println("2 - Show all Customer");
			System.out.println("3 - Modify Customer");
			System.out.println("4 - Delete Customer");
			System.out.println("5 - Search a Customer");
			System.out.println("6 - Exit");
			
			input = scanner.nextInt();
			
			//Adding new pharmatists
			if(input == 1) {
		
				customer.setID(id);
				
				System.out.println("enter Customer name");
				String name = scanner.next();
				customer.setName(name);
				
				System.out.println("enter Customer email");
				String email = scanner.next();
				customer.setEmail(email);
				
				System.out.println("enter Customer phone number");
				int phoneNumber = scanner.nextInt();
				customer.setPhoneNumber(phoneNumber);
				
				System.out.println("enter the number of bought drugs ?");
				int badge = scanner.nextInt();
				customer.setBadge(badge);
				
				//checking customer loyalty
				if(customer.getBadge() >= 3) {
					customer.setStatus("loyal");
				}else {
					customer.setStatus("Not loyal Yet");
				}
				
				customersList.add("------------ Customer list --------------------- \n" +
					"Customer id :" + customer.getID() + "\n" +
					"Customer name :" + customer.getName() + "\n" +
					"Customer Email :" + customer.getEmail() + "\n" +
					"Customer phone number :" + customer.getPhoneNumber() + "\n" +
					"Number of bought drugs :" + customer.getBadge() + "\n" +
					"Customer Status : " + customer.getStatus() + "\n"
						);
				
				id++;
			}
			
			//Displaying all pharmatists
			if (input == 2) {
				for(Object object: customersList) {
					System.out.println(object);
				}
			}
			
			//Modifying a pharmatists
			if (input == 3) {
				System.out.println("enter the customer id to modify ?");
				int modifyCustomer = scanner.nextInt();
				
				customer.setID( modifyCustomer);
				
				modifyCustomer =  modifyCustomer - 1;
				
				System.out.println("enter customer name");
				String name = scanner.next();
				customer.setName(name);
				
				System.out.println("enter customer email");
				String email = scanner.next();
				customer.setEmail(email);
				
				System.out.println("enter customer phone number");
				int phoneNumber = scanner.nextInt();
				customer.setPhoneNumber(phoneNumber);
				
				System.out.println("enter the number of bought drugs ?");
				int badge = scanner.nextInt();
				customer.setBadge(badge);
				
				//checking customer loyalty
				if(customer.getBadge() >= 3) {
					customer.setStatus("loyal");
				}else {
					customer.setStatus("Not loyal Yet");
				}
				
				customersList.set(modifyCustomer ,"------------ Customer list --------------------- \n" +
					"Customer id :" + customer.getID() + "\n" +
					"Customer name :" + customer.getName() + "\n" +
					"Customer email :" + customer.getEmail() + "\n" +
					"Customer phone number :" + customer.getPhoneNumber() + "\n" +
					"Number of bought drugs :" + customer.getBadge() + "\n" +
					"Customer Status : " + customer.getStatus() + "\n"
						);
				
			}
			
			//Deleting a pharmatists
			if (input == 4) {
				System.out.println("enter the Customer id to delete ?");
				int deleteCustomer = scanner.nextInt();
				
				customer.setID(deleteCustomer);
				deleteCustomer = deleteCustomer - 1;
                
				customersList.remove(deleteCustomer);
                
			}
			
			//Searching for pharmatists
			if (input == 5) {
				System.out.println("enter the Customer id to search for ?");
				int searchCustomer = scanner.nextInt();
				
				customer.setID(searchCustomer);
				searchCustomer = searchCustomer - 1;
				
				System.out.println(customersList.get(searchCustomer));
			}
			
			//Return to the main process panel
			if(input == 6) {
				Main.main(null);
			}
			
		}while(input != 6);
		
		scanner.close();
	}
}


