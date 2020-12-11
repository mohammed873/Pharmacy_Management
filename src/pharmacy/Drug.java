package pharmacy;

import java.util.ArrayList;
import java.util.Scanner;

public class Drug {
	private int id;
	private String name;
	private String description;
	private double price;

	//Constructor
	public Drug(int id, String name, String description, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	//Empty Constructor
	public Drug() {
		
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
	
	

    @Override
	public String toString() {
		return "Drug [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}


	//using scan
	Scanner scanner = new Scanner(System.in);

	//creating an array_list for drug
	ArrayList<String> drugList = new ArrayList<>();
	int Id = 1;


	//Adding new drug
	public void drugAdd() {
		
		this.setId(Id);
		
		//Checking if drug name is longer than 6 char
		System.out.println("enter drug name");
		String name = scanner.next();
		if(name.length() > 6) {
			this.setName(name);
		}else {
			System.out.println("name is too short");
			System.exit(0);
		}
		
		//Checking if drug description is longer than 15 char
		System.out.println("enter drug description");
		String description = scanner.next();
		if(description.length() > 15) {
			this.setDescription(description);
		}else {
			System.out.println("name is too short (15 char needed)");
			System.exit(0);
		}
		
		
		System.out.println("enter drug price");
		double price = scanner.nextDouble();
		this.setPrice(price);
		
		drugList.add(this.toString());
		
		Id++;
	}

	//Displaying all drugs
	public void drugShow() {
		for(String drug: drugList) {
			System.out.println(drug.toString());
		}
	}

	//Modifying a drug
	public void drugModify() {
		
		System.out.println("enter the drug id to modify ?");
		int modifyDrug = scanner.nextInt();
		
		this.setId(modifyDrug);
		
		modifyDrug = modifyDrug - 1;
		
		System.out.println("enter drug name");
		String name = scanner.next();
		this.setName(name);
		
		System.out.println("enter drug description");
		String description = scanner.next();
		this.setDescription(description);
		
		System.out.println("enter drug price");
		double price = scanner.nextDouble();
		this.setPrice(price);
		
		drugList.set(modifyDrug, this.toString());
	}

	//Deleting a drug
	public void drugDelete() {
		
		System.out.println("enter the drug id to delete ?");
		int deleteDrug = scanner.nextInt();
		
        this.setId(deleteDrug);
        deleteDrug = deleteDrug - 1;
        
        drugList.remove(deleteDrug);
	}

	//Searching for drug
	public void drugSearch() {
		System.out.println("enter the drug id to search for ?");
		int searchDrug = scanner.nextInt();
		
		this.setId(searchDrug);
		searchDrug = searchDrug - 1;
		
		System.out.println(drugList.get(searchDrug));
	}	
	
	
public void drugDetails() {
		int input;
		
		do {
			System.out.println("1 - Add new Drag");
			System.out.println("2 - Show all Drag");
			System.out.println("3 - Modify Drag");
			System.out.println("4 - Delete Drag");
			System.out.println("5 - Search a Drag");
			System.out.println("6 - Exit");
			
			input = scanner.nextInt();

			switch(input){
			case 1 : 
				drugAdd();
				break;
			case 2 : 
				drugShow();
				break;
			case 3 : 
				drugModify();
				break;	
			case 4 : 
				drugDelete();
				break;
			case 5:
				drugSearch();
				break;
			case 6:
				Main.main(null);
				break;
			}
			
		}while(input != 6);
		
		scanner.close();
	}
}