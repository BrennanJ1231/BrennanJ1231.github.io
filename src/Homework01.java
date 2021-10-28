/*
 * Brennan Johnson
 */
import java.util.Scanner;
public class Homework01 
{
	public static void main(String[] args) 
	{
		String inputOne = "";//initializes each of the variables to be used, input is used most commonly because many variables would have to be created for each different input
		int input = 0;
		int inputTwo = 0;//We use input two so that we can have compound boolean expressions
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Pick one quest - \"Space\", \"Land\".");
		inputOne = keyboard.nextLine();
		if(inputOne.equalsIgnoreCase("Space"))//We ignore case so that the user can just enter the correct name without too much complication
		{
			System.out.println("Choose option 1 or 2: (1)Board the Millenium Falcon or (2) Board the Death Star");// from here on out we use numbers to indicate choices to less complicate things with the user
			input = keyboard.nextInt();
			keyboard.nextLine();
			
			if(input == 1)
			{
				System.out.println("Choose option 1 or 2: (1) Save the princess on the death star or (2) Go on the Kessel Run.");
				input = keyboard.nextInt();
				keyboard.nextLine();
				if(input == 1)
				{
					System.out.println("Congratulations you saved the princess and have recieved one of the most prestigous awards from the rebel alliance");
					
				}
				if(input == 2)
				{
					System.out.println("Oh No! The operation has gone wrong choose (1)Abandon the operation and leave before you're caught or (2)Continue the operation and try to slip through the blockade");
					input = keyboard.nextInt();
					keyboard.nextLine();
					if(input == 1)
					{
						System.out.println("You escaped before you were caught but now your boss is furious and you will have to go into hiding");	
					}
					if(input == 2)
					{
						System.out.println("You nearly slipped through the blockade and are now heading to pay your boss");
					}
				}
			}
			if(input == 2)
			{
				System.out.println("Choose option 1 or 2: (1) Help protect the Death Star from Rebel attackers or (2) Help the Rebel Alliance with their efforts");
				input = keyboard.nextInt();
				keyboard.nextLine();
				if(input == 1)
				{
					System.out.println("The Death Star is destroyed however you escape in time and are awarded the highest honor for your bravery and reassigned as an Emperors Royal Guard");
				}
				if(input == 2)
				{
					System.out.println("You are caught helping the Rebel Alliance and are ruled a traitor and imprisoned");
				}
			}
		}
		
		if(inputOne.equalsIgnoreCase("Land"))
		{
			System.out.println("Choose option 1 or 2: (1) Go to Middle Earth or (2) Go to Westoros");
			input = keyboard.nextInt();
			keyboard.nextLine();
			if(input == 1)
			{
				System.out.println("Choose one of the following options: (1) Bear the one ring (2) refuse one ring");
				input = keyboard.nextInt();
				System.out.println("Now Choose one of the following: (1) Go on an adventure or (2) hide ");
				inputTwo = keyboard.nextInt();
				if(input == 1 && inputTwo == 1)
				{
					System.out.println("You go to Mount Doom and destroy the One Ring and Save Middle Earth");
				}
				else
				{
					System.out.println("You live a long happy life");
					input = 0;//clears input so that there wont be any errors
				}
				
			}
			if(input == 2)
			{
				System.out.println("Choose one of the following options: (1) Join the rebellion on Kings Landing or (2) tend to your farm");
				input = keyboard.nextInt();
				if(input == 1)
				{
					System.out.println("You defeat the Lannisters and now have nobility in Westoros");
				}
				if(input == 2)
				{
					System.out.println("The Lannisters take your farm land and now you roam the land gathering others to mount another rebellion");
				}
			}
		}
	}
	
	
}
