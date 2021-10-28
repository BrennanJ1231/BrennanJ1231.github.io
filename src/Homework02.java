
/*
 * Brennan Johnson
 */
import java.util.Scanner;
import java.util.Random;
public class Homework02 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		String[] selections = {"Rock", "Paper", "Scissor"};//Used so that the computer can make a random selection based out of the index of an array
		boolean playAgain = false;
		String user_Selection;
		String computer_Selection;
		int userPoints = 0;
		int computerPoints = 0;
		
		do
		{
			for(int i = 0; i<3; i++)//Runs through the three rounds
			{
				System.out.println("Select (1) Rock, (2) Paper, or (3) Scissors");
				user_Selection = selections[keyboard.nextInt()-1];
				computer_Selection = selections[r.nextInt(3)];
				keyboard.nextLine();
				System.out.println("Computer: " + computer_Selection);
				System.out.println("User: " + user_Selection);
			
				if(user_Selection.equalsIgnoreCase(selections[0]) && computer_Selection.equalsIgnoreCase(selections[1]))//Checks if User has rock and computer has paper
				{
					System.out.println("Rock beats paper. You Win! ");
					userPoints ++;
				}
				else if(user_Selection.equalsIgnoreCase(selections[1]) && computer_Selection.equalsIgnoreCase(selections[0]))//Does the opposite of the above if statement
				{
					System.out.println("Rock beats paper. Computer Wins!");
					computerPoints ++;
				}
				else if(user_Selection.equalsIgnoreCase(selections[1]) && computer_Selection.equalsIgnoreCase(selections[2]))//Check if the use has paper and the computer has scissors
				{
					System.out.println("Scissors beats paper. Computer Wins!");
					computerPoints ++;
				}
				else if(user_Selection.equalsIgnoreCase(selections[2]) && computer_Selection.equalsIgnoreCase(selections[1]))//Does opposite of the if statement above
				{
					System.out.println("Scissor beats paper. You Win!");
					userPoints ++;
				}
				else if(user_Selection.equalsIgnoreCase(selections[0]) && computer_Selection.equalsIgnoreCase(selections[2]))//Check if the user has rocks and the computer has paper
				{
					System.out.println("Rock beats Scissors. You Win!");
					userPoints ++;
				}
				else if(user_Selection.equalsIgnoreCase(selections[2]) && computer_Selection.equalsIgnoreCase(selections[0]))//Does the opposite of the if statement above
				{
					System.out.println("Rock beats Scissors. Computer Wins!");
					computerPoints ++;
				}
				else if(user_Selection.equals(computer_Selection))//Checks if the user and computer have the same selection
				{
					System.out.println("Tie! You both dont get a point");
				}
			}
			
			if(computerPoints > userPoints)
			{
				System.out.println("Computer wins!");
			}
			else if(computerPoints < userPoints)
			{
				System.out.println("Player wins!");
			}
			else if(computerPoints == userPoints)
			{
				System.out.println("You and the Computer Tied!");
			}
			System.out.println("Would you like to play again: \"Yes\" or \"No\"");
			user_Selection = keyboard.nextLine();
			if(user_Selection.equalsIgnoreCase("Yes"))
			{
				playAgain = true;
				computerPoints = 0;
				userPoints = 0;
			}
			else if(user_Selection.equalsIgnoreCase("No"))
			{
				System.out.println("Have a great day!");
				playAgain = false;
			}
		}while(playAgain);//Do while used so that the program can run first under the pretense that the user wont play again until prompted to

	}

}
