package pharmacy;

import java.util.ArrayList;
import java.util.Scanner;

public class Drug {
	private int id;
	private String name;
	private String description;
	private double price;

	public Drug(int id, String name, String description, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
public void drugDetails() {
		
		int input;
		Scanner scanner = new Scanner(System.in);
		
		//creating an array_list for drugs
		ArrayList<Object> drugList = new ArrayList<>();
		
		int id = 1;
		
		do {
			System.out.println("1 - Add new Drag");
			System.out.println("2 - Show all Drag");
			System.out.println("3 - Modify Drag");
			System.out.println("4 - Delete Drag");
			System.out.println("5 - Search a Drag");
			System.out.println("6 - Exit");
			
			input = scanner.nextInt();
			Drug drug = new Drug(id, description, description, price);
			
			//Adding drugs to the array_list
			if(input == 1) {
				drug.setId(id);
				
				System.out.println("enter drug name");
				String name = scanner.next();
				drug.setName(name);
				
				System.out.println("enter drug description");
				String description = scanner.next();
				drug.setDescription(description);
				
				System.out.println("enter drug price");
				double price = scanner.nextDouble();
				drug.setPrice(price);
				
				drugList.add("------------ Drug list --------------------- \n" +
					"drug id :" + drug.getId() + "\n" +
					"drug name :" + drug.getName() + "\n" +
					"drug description :" + drug.getDescription() + "\n" +
					"drug price :" + drug.getPrice()
						);
				
				id++;
			}
			
			//Displaying all drugs in the list
			if (input == 2) {
				for(Object object: drugList) {
					System.out.println(object);
				}
			}
			
			//Modifying a drug
			if (input == 3) {
				System.out.println("enter the drug id to modify ?");
				int modifyDrug = scanner.nextInt();
				
				drug.setId(modifyDrug);
				
				modifyDrug = modifyDrug - 1;
				
				System.out.println("enter drug name");
				String name = scanner.next();
				drug.setName(name);
				
				System.out.println("enter drug description");
				String description = scanner.next();
				drug.setDescription(description);
				
				System.out.println("enter drug price");
				double price = scanner.nextDouble();
				drug.setPrice(price);
				
				drugList.set(modifyDrug ,"------------ Drug list --------------------- \n" +
					"drug id :" + drug.getId() + "\n" +
					"drug name :" + drug.getName() + "\n" +
					"drug description :" + drug.getDescription() + "\n" +
					"drug price :" + drug.getPrice() + "\n"
						);
				
			}
			
			//Deleting a drug
			if (input == 4) {
				System.out.println("enter the drug id to delete ?");
				int deleteDrug = scanner.nextInt();
				
                drug.setId(deleteDrug);
                deleteDrug = deleteDrug - 1;
                
                drugList.remove(deleteDrug
    						);
                
			}
			
			//Searching for a drug
			if (input == 5) {
				System.out.println("enter the drug id to search for ?");
				int searchDrug = scanner.nextInt();
				
				drug.setId(searchDrug);
				searchDrug = searchDrug - 1;
				
				System.out.println(drugList.get(searchDrug));
			}
			
			//Return to the main process panel
			if(input == 6) {
				Main.main(null);
			}
			
		}while(input != 6);
		
		scanner.close();
	}
}