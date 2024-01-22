package Lab1;
//By: Claire Dano
public class TestScores {
//Instantiate Private Variables
	private double[] testScores;
//Constructors -- should accept an array of tests scores as an argument
	public TestScores(double[] scoreArray)
	{
		testScores = scoreArray;
	}
//Methods
	//Return average test scores method
	public double getTestAverage()
	{
		double total = 0;
		double average;
		
		if (testScores.length < 2)
		{
			System.out.println("ERROR: You must have at least two test scores inputed!");
			average = 0;
		}
		else {
			for(double score : testScores)
			{
				if (score < 0 || score > 100) {
					throw new IllegalArgumentException("ERROR: Test Score is Invalid");
				}
				total += score;
			}
			average = total / (testScores.length);
		}
		return average;
	}
	//Print test scores method
	public String PrintTestScoresInfo()
	{
		 String myReturn = "";
		myReturn += "\nNumber of Test Scores: " + testScores.length;
		myReturn += "\nAverage Test Scores: " + this.getTestAverage();
		return myReturn;
	}
}
