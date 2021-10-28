/*
 * Brennan Johnson
 */
import java.util.Scanner;
import java.util.Random;
public class Lab03 {

	public static void main(String[] args) 
	{
		final int UPPER_BOUND = 6;//is the max of the random value that the dice can roll
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int numTimes = 0;
		int[] roll_list = new int[6];//Easier to keep tally using an array. Decreases the amount of variables used
		System.out.println("Enter the number of times a 6-sided die should be rolled");
		numTimes = keyboard.nextInt();
		if( numTimes <= 0)//Checks if number entered is non zero
		{
			System.out.println("Error you entered an invalid number");
			System.exit(0);
		}
		for(int i = 0; i<numTimes; i++)
		{
			int roll = rand.nextInt(UPPER_BOUND);
			System.out.println(roll+1 + " was rolled");//add 1 to roll since its a random number between 0 and 5
			for(int j = 0; j<roll_list.length; j++)
			{
				if(j == roll)//checks if the roll is equal to a place in the roll_list so that tally can be made
				{
					roll_list[j] +=1;
				}
					
			}
			
		}
		System.out.println("One: " + roll_list[0] 
						+ "\nTwo: " + roll_list[1]
						+ "\nThree: " + roll_list[2]
						+ "\nFour: " + roll_list[3]
						+ "\nFive: " + roll_list[4]
						+ "\nSix: " + roll_list[5]);
	}

}
