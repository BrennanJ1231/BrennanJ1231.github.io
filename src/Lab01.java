/*
 * Brennan Johnson
 */
import java.util.Scanner;
public class Lab01 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int numEntered = 0;// holds the initial value that was entered so that it can be displayed later
		int numQuarters = 0;
		int numDimes = 0;
		int numNickles = 0;
		int numPennies = 0;
		System.out.println("Enter a whole number from 1 to 99. The machine will dteremine a combination of coins");
		numEntered = keyboard.nextInt();
		keyboard.nextLine();
		numQuarters = numEntered/25; // gets the number of quarters that are in the number
		int newNum = numEntered %25; //stores the remainder of the first operation
		numDimes = newNum/10;
		newNum = newNum % 10; //gets the second remainder so that we can find how many coins are left for nickles and pennies
		numNickles = newNum / 5;
		newNum = newNum % 5;
		numPennies = newNum; //The final remainder is assigned to pennies because no further operations are needed
		System.out.println(numEntered + " cents in coins:\n" + numQuarters + " Quarters\n" 
				+ numDimes + " Dimes\n" + numNickles + " Nickles\n" + numPennies + " Pennies");
	}
}
