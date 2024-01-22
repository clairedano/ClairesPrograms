/**
 * 
 */
package Lab3;

import Lab3.Address;
import Lab3.Benefits;

/**
 * @author clairedano
 * By: Claire Dano
 */
public class Employee {
//create private variables
	private String employeeID;
	private String firstName;
	private String lastName;
	private Benefits employeeBenefits;
	private Address employeeWorkAddress;
	private String employeeHomeAddress;
// GETTERS AND SETTERS	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
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
public Benefits getEmployeeBenefits() {
		return employeeBenefits;
	}
	public void setEmployeeBenefits(Benefits employeeBenefits) {
		this.employeeBenefits = employeeBenefits;
	}
	public Address getEmployeeWorkAddress() {
		return employeeWorkAddress;
	}
	public void setEmployeeWorkAddress(Address employeeWorkAddress) {
		this.employeeWorkAddress = employeeWorkAddress;
	}
	public String getEmployeeHomeAddress() {
		return employeeHomeAddress;
	}
	public void setEmployeeHomeAddress(String employeeHomeAddress) {
		this.employeeHomeAddress = employeeHomeAddress;
	}
	// CONSTRUCTORS 
	public Employee(String pEmployeeID, String pFirstName, String pLastName,
			String pEmployeeHomeAddress,  Benefits pEmployeeBenefits, Address pEmployeeWorkAddress) {
		super();
		this.employeeID = pEmployeeID;
		this.firstName = pFirstName;
		this.lastName = pLastName;
		this.employeeBenefits = pEmployeeBenefits;
		this.employeeHomeAddress = pEmployeeHomeAddress;
		this.employeeWorkAddress = pEmployeeWorkAddress;
	}
//PRINT INFO
	public String toString()
	{
		String myReturn = "";
		myReturn = "\nEmployee ID: " + this.getEmployeeID() + "\n";
		myReturn += "First Name: " + this.getFirstName() + "\n";
		myReturn += "Last Name: " + this.getLastName() + "\n";
		myReturn += "\nBenefits: \n"+ employeeBenefits.PrintBenefitInfo() + "\n";
		myReturn += "Employee Home Address: " + this.getEmployeeHomeAddress() + "\n";
		myReturn += "\nEmployee Work Address: " + employeeWorkAddress.PrintAddressInformation() + "\n";
		return myReturn;
		
	}
	
}



