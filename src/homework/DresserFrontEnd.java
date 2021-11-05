/*
 * Brennan Johnson
 */
package homework;
import java.util.Scanner;
public class DresserFrontEnd {
	
	private static Scanner input = new Scanner(System.in);
	private static Dresser dresser = new Dresser();
	public static void main(String[] args) 
	{
		boolean playAgain = true;
		int choice;
		do
		{
			System.out.println("Choose (1) Add clothes to dresser, (2) Remove clothes from dress, (3) quit");
			choice = input.nextInt();
			input.nextLine();
			if(choice == 1)
			{
				addToDresser();
			}
			else if(choice == 2)
			{
				removeFromDresser();
			}
			else if(choice == 3)
			{
				playAgain = false;
			}
			dresser.print();
			
		}while(playAgain);

	}
	
	public static void addToDresser()
	{
		System.out.println("Enter the type of clothing");
		String type = input.nextLine();
		System.out.println("Enter the color");
		String color = input.nextLine();
		dresser.add(new Clothing(type, color));
	}
	
	public static void removeFromDresser()
	{
		System.out.println("Enter the type of clothing");
		String type = input.nextLine();
		System.out.println("Enter the color");
		String color = input.nextLine();
		dresser.remove(new Clothing(type, color));
	}

}
