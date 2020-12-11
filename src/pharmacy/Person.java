package pharmacy;

public class Person {
	private int id;
	private String name;
	private int phoneNumber;
	private String email;

	
	//Contractor
	public Person(int id, String name, int phoneNumber, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	// Empty Contractor
	public Person() {
		
	}


	public int getID() {
		return id;
	}
	public void setID(int iD) {
		this.id = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + "";
	}
}
