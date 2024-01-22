package Lab3;

abstract class MedicalProvider {
//Instantiate private variables
	private String firstName;
	private String lastName;
	private String employeeID;
	private OfficeLocation employeeOfficeLocation;
//Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public OfficeLocation getEmployeeOfficeLocation() {
		return employeeOfficeLocation;
	}
	public void setEmployeeOfficeLocation(OfficeLocation employeeOfficeLocation) {
		this.employeeOfficeLocation = employeeOfficeLocation;
	}
//Defualt Constructor
	public MedicalProvider(String firstName, String lastName, String employeeID,
			OfficeLocation employeeOfficeLocation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.employeeOfficeLocation = new OfficeLocation (employeeOfficeLocation);
	}
//Copy Constructor
	public MedicalProvider(MedicalProvider pMedicalProvider)
	{
		super();
		this.firstName = pMedicalProvider.firstName;
		this.lastName = pMedicalProvider.lastName;
		this.employeeID = pMedicalProvider.employeeID;
		this.employeeOfficeLocation = pMedicalProvider.employeeOfficeLocation;
	}
//Print MedicalProviderInfo Method
	public String PrintMedicalProviderInfo() 
	{
		String myReturn = "";
		myReturn = "--------------------------------------------";
		myReturn += "\nFirst Name: " + this.getFirstName();
		myReturn += "\nLast Name: " + this.getLastName();
		myReturn += "\nEmployee ID: " + this.getEmployeeID();
		myReturn += "\n\n\nMedical Provider's Office Location: " + employeeOfficeLocation.PrintOfficeLocationInfo() + "\n";
	
		return myReturn;
	}
//toString Method for print
	public String toString() {
		return "Employee [firstName=" + firstName + "lastName=" + lastName + "EmployeeID=" + employeeID + "]";
	}
	abstract void WriteToFile();
}
