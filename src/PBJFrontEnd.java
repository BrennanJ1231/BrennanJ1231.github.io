/*
 * Brennan Johnson
 */
import java.util.Scanner;
public class PBJFrontEnd {

	public static void main(String[] args) 
	{
		PBJSandwhich pbjOne = new PBJSandwhich();
		PBJSandwhich pbjTwo = new PBJSandwhich();
		String name;
		String type;
		String again;
		int calories;
		boolean crunch;
		
		Scanner input = new Scanner(System.in);
		Boolean playAgain = false;
		System.out.println("Welcome to PBJ Sandwhich builder");
		do//continues until the user stops the program
		{
			System.out.println("PBJ Sandwhich one");
			pbjOne = createSandwhich(pbjOne);
			

			System.out.println("PBJ Sandwhich two");
			pbjTwo = createSandwhich(pbjTwo);
			
			System.out.println("PBJ Sandwhich one: " + pbjOne.toString());
			System.out.println("PBJ Sandwhich two: " + pbjTwo.toString());
			
			System.out.println("PBJ Sandwhich one and two are the same: " + pbjOne.equals(pbjTwo));
			System.out.println("Whould you like to play again true or false");
			again = input.nextLine();
			if(again.equalsIgnoreCase("true"))
			{
				playAgain = true;
			}
			else 
			{
				playAgain = false;
			}
		}while(playAgain);
		

	}
	
	public static PBJSandwhich createSandwhich(PBJSandwhich pbj)//allows the user to input values for each instance variable of pbj. Used so that code does not have to be written twice
	{
		Scanner input = new Scanner(System.in);
		String name;
		String type;
		String again;
		int calories;
		boolean crunch;
		System.out.println("Enter the name, type, and calories for the top slice of bread");
		name = input.nextLine();
		type = input.nextLine();
		calories = input.nextInt();
		
		pbj.setTopSlice(new Bread(name, calories, type));
		input.nextLine();
		
		System.out.println("Enter the name, type, and calories for the bottom slice of bread");
		name = input.nextLine();
		type = input.nextLine();
		calories = input.nextInt();
		
		pbj.setBottomSlice(new Bread(name, calories, type));
		input.nextLine();
		
		System.out.println("Enter the name, type, and calories for the Jelly");
		name = input.nextLine();
		type = input.nextLine();
		calories = input.nextInt();
		
		pbj.setJelly(new Jelly(name, calories, type));
		input.nextLine();
		
		System.out.println("Enter the name, crunchy(true or false), calories for PeanutButter");
		name = input.nextLine();
		type = input.nextLine();
		calories = input.nextInt();
		if(type.equalsIgnoreCase("True"))
		{
			crunch = true;
		}
		else
		{
			crunch = false;
		}
		pbj.setPeanutButter(new PeanutButter(name, calories, crunch));
		return pbj;
	}

}
