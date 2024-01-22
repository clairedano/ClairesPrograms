package Lab3;
import java.text.NumberFormat;

public class Doctor extends MedicalProvider implements WriteToFile {
	//Instantiate private variables
	private String specialty;
	private String licenseNumber;
	private String roomNumber;
	private double yearlySalary;
	NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
	//Getters and Setters
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public double getYearlySalary() {
		return yearlySalary;
	}
	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	//Default Constructor
	public Doctor(String firstName, String lastName, String employeeID, OfficeLocation employeeOfficeLocation,
			String specialty, String licenseNumber, String roomNumber, double yearlySalary) {
		super(firstName, lastName, employeeID, employeeOfficeLocation);
		this.specialty = specialty;
		this.licenseNumber = licenseNumber;
		this.roomNumber = roomNumber;
		this.yearlySalary = yearlySalary;
	}
	//Copy Constructor
	public Doctor (Doctor pDoctor)
	{
		super(pDoctor);

		this.specialty = pDoctor.specialty;
		this.licenseNumber = pDoctor.licenseNumber;
		this.roomNumber = pDoctor.roomNumber;
		this.yearlySalary = pDoctor.yearlySalary;
	}

	public String PrintDoctorInfo() //= super.PrintEmployeeInfo();
	{
		String myReturn = super.PrintMedicalProviderInfo();
		myReturn += this.getEmployeeID() + ", ";
		myReturn += "Doctor, ";
		myReturn += this.getFirstName() + " " + this.getLastName() + ", ";
		myReturn += this.getEmployeeOfficeLocation().PrintOfficeLocationInfo() + ", ";
		myReturn += this.getSpecialty() + ", ";
		myReturn += this.getLicenseNumber() + ", ";
		myReturn += this.getRoomNumber() + ", ";
		myReturn += fmt.format(this.getYearlySalary()) + ", ";
		return myReturn;
	}
	 private String createCsvString()
	 {
		 String myReturn = "";
		 myReturn = this.getEmployeeID() + ", ";
		 myReturn += "Doctor, ";
		 myReturn += this.getFirstName() + " " + this.getLastName() + ", ";
		 myReturn += this.getEmployeeOfficeLocation().PrintOfficeLocationInfo() + ", ";
		myReturn += this.getSpecialty() + ", ";
		myReturn += this.getLicenseNumber() + ", ";
		myReturn += this.getRoomNumber() + ", ";
		myReturn += this.getYearlySalary() + ",\n ";
		return myReturn;
	}
	 
	@Override
	public void WriteToFile()
	{
		WriteRecordToFile(this.createCsvString());
	}	


}


