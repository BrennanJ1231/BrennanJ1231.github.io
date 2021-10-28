/*
 * Brennan Johnson
 */
import java.util.Scanner;
public class Lab04 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int size = 0;
		System.out.println("Welcome to Triangle Maker! Enter the size of the triangle.");
		size = keyboard.nextInt();
		if(size <=0)//Checks if the value entered is a negative integer
		{
			System.out.println("Invalid size");
			System.exit(0);
		}
		for (int i=1; i<size; i ++)//Builds the first half of the triangle starting at 1 *
		{
		    for (int j=0; j<i; j++)// This is what displays the number of * based on the row
		    {
		        System.out.print("*");
		    }
		    System.out.println("");
		}
		for(int i = size; i>0; i--)//Builds the second half of the triangle rather than increasing this decreases
		{
			for(int j = 0; j<i; j++)
			{
				System.out.print("*");//Does the same as the nested loop in the first loop
			}
			System.out.println("");
		}
	}

}
