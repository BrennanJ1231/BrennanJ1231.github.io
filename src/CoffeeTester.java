/*
 * Brennan Johnson
 */
import java.util.Scanner;
public class CoffeeTester 
{

	public static void main(String[] args) 
	{
		Coffee coffeeOne = new Coffee();
		Coffee coffeeTwo = new Coffee();
		Scanner input = new Scanner(System.in);
		String d;
		boolean playAgain = false;
		do
		{
		System.out.println("Enter the name of the first coffee");//creates the first coffee
		coffeeOne.setName(input.nextLine());
		System.out.println("Enter the caffeine content of the first coffee");
		coffeeOne.setCaffeineContent(input.nextInt());
		
		input.nextLine();
		
		System.out.println("Enter the name of the second coffee");//Creates the second coffee
		coffeeTwo.setName(input.nextLine());
		System.out.println("Enter the caffeine content of the second coffee");
		coffeeTwo.setCaffeineContent(input.nextInt());
		input.nextLine();
		
		System.out.println("Coffee one: " + coffeeOne.toString() + ". " + coffeeTwo.riskyAmount());
		
		System.out.println("Coffee Two: " + coffeeTwo.toString() + ". " + coffeeTwo.riskyAmount());
		
		if(coffeeOne.equals(coffeeTwo))//checks if the two objects are the same
		{
			System.out.println("Coffee One and Coffee Two have the same properties");
		}
		else
		{
			System.out.println("Coffee One and Coffee Two do not have the same properties");
		}
		
		System.out.println("Do you want try different Coffee? \"YES\" or \"NO\"");
		d = input.nextLine();
		
		if(d.equalsIgnoreCase("yes"))//checks if the user wants to play again
			playAgain = true;
		else
			playAgain = false;
		
		}while(playAgain);//do while is used so that the program can run once before being checked if the user wants to go again
	}

}
