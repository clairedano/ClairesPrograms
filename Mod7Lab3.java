/**
 * 
 */
package Lab3;
import java.util.ArrayList;

/**
 * @author clairedano
 * By: Claire Dano
 */
public class Mod7Lab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// instantiate a Benefit object using the
				Benefits myBenefits = new Benefits("Healthcare", 500, "United Health Care");
		// instantiate an Address object using the
				Address myWorkAddress = new Address("3535 N Ellison Dr", "San Antonio", "Texas", "78251");
		// create an array list
		ArrayList<Employee> myEmployee = new ArrayList<Employee>();
		myEmployee.add(new Employee("766194", "Claire", "Dano", "\n13506 Palatine Hill\nSan Antonio, Texas 78253", myBenefits, myWorkAddress));
		myEmployee.add(new Employee("248953", "Jarrod", "Tome", "\n54321 Lackland AFB \nSan Antonio, Texas 78258", myBenefits, myWorkAddress));
		myEmployee.add(new Employee("843522", "Darlene", "Espritu", "\n223 Clover Rd\nSan Antonio, Texas 78334", myBenefits, myWorkAddress));
		myEmployee.add(new Employee("883471", "Garbrielle", "Kinzinger", "\n213 Bella Dona Dr\nSan Antonio, Texas 78253", myBenefits, myWorkAddress));
		
		System.out.println("WELCOME TO YOUR EMPLOYEE INFORMATION PROGRAM!");
		
		for(Employee myEmployeesInfo : myEmployee)
		{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(myEmployeesInfo);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}

		
}
}