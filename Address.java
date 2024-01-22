/**
 * 
 */
package Lab3;

/**
 * @author clairedano
 * By: Claire Dano
 */
public class Address {
// create private variables
	private String street;
	private String city;
	private String state;
	private String zip;
// CONSTRUCTORS
	public Address(String street, String city, String state, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public Address()
	{
		super();
		street = "Unknown"; 
		city = "Unknown";
		state = "Unknown";
		zip = "Unknown";
	}
// GETTERS AND SETTERS
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String PrintAddressInformation()
	{
		String myReturn= "";
		myReturn = "\n" + this.getStreet() + "\n" + this.getCity()
			+ ", " + this.getState() + " " + this.getZip();
		return myReturn;
	}
}
