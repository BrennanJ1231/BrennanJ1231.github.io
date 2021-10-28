/*
 * Brennan Johnson
 */
import java.util.Scanner;
public class Lab05 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double[] tempList = new double[10];//Creates list to store temperature values
		double avg;
		System.out.println("Welcome to the below average temperature tester program");
		for(int i = 1; i < tempList.length + 1; i ++)//Start at 1 so it is easier to display the day in the prompt
		{
			System.out.println("Please enter the temperature for day " + i);
			tempList[i-1] = keyboard.nextDouble();
		}
		avg = calcAverage(tempList);//Calls the method to calculate the avg
		System.out.println("The average temperature was " + avg);
		
		System.out.println("The days that were below average were");
		for(int i = 0; i<tempList.length; i++)//Runs through list so that it can find points below the avg
		{
			if(tempList[i] < avg)
			{
				int day = i + 1;
				System.out.println("Day " +  day + " with " + tempList[i]);
			}
		}
	}
	
	public static double calcAverage(double[] list)//Calculates the avg, used to make code more organized
	{
		double avg = 0;
		for(int i = 0; i < list.length; i ++)
		{
			avg += list[i];
		}
		avg = avg/list.length;
		return avg;
	}

}
