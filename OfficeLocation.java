package Lab3;

public class OfficeLocation {
//Instantiating Variables
	private String officeName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
//Getters and Setters
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	//Default Constructor
	public OfficeLocation(String officeName, String address, String city, String state, String phone, String zip) {
		super();
		this.officeName = officeName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
	
	}
//Copy Constructor
	public OfficeLocation(OfficeLocation pOffice)
	{
		this.officeName = pOffice.officeName;
		this.address = pOffice.address;
		this.city = pOffice.city;
		this.state = pOffice.state;
		this.zip = pOffice.zip;
		this.phone = pOffice.phone;
	}
//Methods
//Print Office Location Info
	public String PrintOfficeLocationInfo()
	{
		String myReturn = "";
		myReturn += this.getOfficeName() + ", " ;
		myReturn += this.getAddress() + ", " ;
		myReturn += this.getCity() + ", ";
		myReturn += this.getState() + ", ";
		myReturn += this.getZip() + ", ";
		myReturn += this.getPhone()+ ", ";
		return myReturn;
	}//end of printinfo
}//end of class
