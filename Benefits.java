/**
 * 
 */
package Lab3;
import java.text.NumberFormat;
/**
 * @author clairedano
 * By: Claire Dano
 */
public class Benefits {
//create private variables
	private String type;
	private float cost;
	private String provider;
	 NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
//CONSTRUCTORS
	public Benefits(String type, float cost, String provider) {
		super();
		this.type = type;
		this.cost = cost;
		this.provider = provider;
	}
	public Benefits()
	{
		super();
		type = "NONE";
		cost = 0;
		provider = "NONE";
	}
// GETTERS AND SETTERS
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String PrintBenefitInfo()
	{
		String myReturn = "";
		myReturn = "Type: " + this.getType() + "\n";
		myReturn += "Cost: " + fmt1.format(this.getCost()) + "\n";
		myReturn += "Provider: " + this.getProvider() + "\n";
		return myReturn;
		
	}
	
}
