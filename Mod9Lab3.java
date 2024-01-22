package Lab3;
import java.util.ArrayList;
public class Mod9Lab3 {

	public static void main(String[] args) {
	//Create Instance of OfficeLocation
	OfficeLocation myOfficeLocation = new OfficeLocation ("TomeTrauma Care", "2778 Tally Road", "San Antonio", "Texas", "78251", "2107739581");
	//Array List
	ArrayList<MedicalProvider> myMedicalProvider = new ArrayList <MedicalProvider>();
	myMedicalProvider.add(new Doctor("Jarrod", "Tome", "679673", myOfficeLocation, "Trauma Rehab", "193556471", "11", 135000.52));
	myMedicalProvider.add(new Doctor("Claire", "Dano", "766194", myOfficeLocation, "Psychology", "193291574", "22", 108500.79 ));
	myMedicalProvider.add(new Nurse("Gabrielle", "Kinzinger", "955162", myOfficeLocation, "Registered Nurse (RN) ", 45.50, 30.0));
	myMedicalProvider.add(new Nurse("Joy", "DoiDoi", "032919", myOfficeLocation, "Certified Nursing Assistant (CNA) ", 28.32, 28.0));
	
	
	//write to file
		myMedicalProvider.forEach((item) -> { 
			item.WriteToFile(); 
			System.out.println("Record added to file: " + item.getFirstName());
			} );	

		
	}//end of main
}//end of class
