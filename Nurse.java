package Lab3;
import java.text.NumberFormat;
public class Nurse extends MedicalProvider implements WriteToFile {
//Instanitate Private Variables
	private String type;
	private double hourlyRate;
	private double hoursWorked;
	private double weeklyPayCheck;
	NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
//Getters and Setters
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
//Default Constructor
	public Nurse(String firstName, String lastName, String employeeID, OfficeLocation employeeOfficeLocation,
			String type, double hourlyRate, double hoursWorked) {
		super(firstName, lastName, employeeID, employeeOfficeLocation);
		this.type = type;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
//Copy Constructor
	public Nurse (Nurse pNurse)
	{
		super(pNurse);
		this.type = pNurse.type;
		this.hourlyRate = pNurse.hourlyRate;
		this.hoursWorked = pNurse.hoursWorked;
	}
//Print Nurse Info Method
	public String PrintNurseInfo()
	{
		String myReturn = super.PrintMedicalProviderInfo();
		myReturn += "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
		myReturn += "\n     MEDICAL PROVIDER: NURSE INFO      ";
		myReturn += "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
		myReturn += "\nType: " + this.getType();
		myReturn += "\nHourly Rate: " + fmt.format(this.getHourlyRate());
		myReturn += "\nHours Worked in a Week: " + this.getHoursWorked();
		myReturn += "\nWeekly Pay Check: " + fmt.format(this.getWeeklyPayCheck())+ "\n";
		return myReturn;
	}
//Method for WeeklyPayCheck()
	public double getWeeklyPayCheck()
	{
		weeklyPayCheck = this.getHourlyRate() * this.getHoursWorked();
		return weeklyPayCheck;
	}
	 private String createCsvString()
	 {
		 String myReturn = "";
		 myReturn += this.getEmployeeID() + ", ";
		 myReturn += "Nurse, ";
		 myReturn += this.getFirstName() + " " + this.getLastName() + ", ";
		 myReturn += this.getEmployeeOfficeLocation().PrintOfficeLocationInfo() + ", ";
		 myReturn += this.getHourlyRate() + ", " ;
		 myReturn += this.getHoursWorked() + ", ";
		 myReturn += this.getWeeklyPayCheck() + ", ";
		 return myReturn;
		 
	 }
	@Override
	public void WriteToFile()
	{
		WriteRecordToFile(this.createCsvString());
	}	

}
