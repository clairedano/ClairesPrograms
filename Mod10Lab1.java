package Lab1;
import java.util.Scanner;

//By: Claire Dano
public class Mod10Lab1 {

	public static void main(String[] args) {
		//Instantiate variables
    	int numberOfScores = 0;
		Scanner myScan = new Scanner(System.in);
		//Prompt User for Test Scores
		System.out.println("How Many Test Scores Do You Have? ");
		numberOfScores = myScan.nextInt();
		double[] scores = new double[numberOfScores];
		//Creating the Array to hold the test scores
		for(int index = 0; index < numberOfScores; index++)
		{
			System.out.println("Please Enter the score for Test #" + (index + 1) + ": ");
			scores[index] = myScan.nextDouble();
		}
		//Instantiate TestScore Object
		TestScores myTestScores = new TestScores(scores);
		//Print testScore method
		System.out.println(myTestScores.PrintTestScoresInfo());
		myScan.close();
	}
}