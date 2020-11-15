
public class Contact {
	
	//instance variables
	private String name;
	private String phoneNo;
	
	//Constructor
	Contact(){
		System.out.println("New contact created.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
