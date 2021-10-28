/*
 * Brennan Johnson
 */
import java.util.Scanner;
public class Homework03 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int arraySize = 0;
		double circleSize;
		int sortDecision;
		boolean decision = false;
		System.out.println("How many cirlces do you want to enter?");//used so that we create the right size array for the user
		arraySize = keyboard.nextInt();
		double[] circleList = new double[arraySize];
		System.out.println("Enter in the first circle radius");
		circleSize = Math.pow(keyboard.nextDouble(),2) * Math.PI;
		circleList[0] = circleSize;
		for(int i = 1; i<circleList.length; i++)// calculates the area of each circle
		{
			System.out.println("Enter the next circles radius");
			circleSize = Math.pow(keyboard.nextDouble(),2) * Math.PI;
			circleList[i] = circleSize;
		}
		while(!decision)//keeps the program running if the user enters an invalid option
		{
			System.out.println("Enter 1 to sort from smallest to largest. Enter 2 to sort from largest to smallest");
			sortDecision = keyboard.nextInt();
			keyboard.nextLine();
			if(sortDecision ==1)
			{
				sortSmallToLarge(circleList);
				decision = true;
			}
			else if(sortDecision == 2)
			{
				sortLargeToSmall(circleList);
				decision = true;
			}
			else
			{
				System.out.println("Invalid option. Try again");
			}
		}
		
	}
	
	public static void sortSmallToLarge(double[] list)//sorts ascending order using bubble sort and the displays
	{
		boolean swapped = true;
		while(swapped)
		{
			swapped = false;
			for(int i = 0; i<list.length-1; i++)
			{
				if(list[i] >= list[i+1])
				{
					double temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					swapped = true;
				}
			}
		}
		System.out.print("The sorted circles:");
		for(int k = 0; k<list.length; k++)
		{
			System.out.print(" " + list[k]);
		}
	}
	
	public static void sortLargeToSmall(double[] list)// sorts descending order using bubble sort and then displays
	{
		boolean swapped = true;
		while(swapped)
		{
			swapped = false;
			for(int i = 0; i<list.length-1; i++)
			{
				if(list[i] <= list[i+1])
				{
					double temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					swapped = true;
				}
			}
		}
		System.out.print("The sorted circles:");
		for(int k = 0; k<list.length; k++)
		{
			System.out.print(" " + list[k]);
		}
	}

}
