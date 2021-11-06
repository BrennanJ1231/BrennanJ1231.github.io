/*
 * Brennan Johnson
 */

package Labs;
import java.util.Scanner;

public class BoxSorter {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Box[] boxes;
		String label;//all the variables to hold values of the box
		double length;
		double width;
		double height;
		boolean playAgain = false;
		System.out.println("Welcome to box sorter!\n");
		do//do while loop used so that the condition doesnt have to be checked first
		{
			System.out.println("Enter the number of boxes you would like to sort or -1 to quit the program");
			boxes = new Box[input.nextInt()];
			input.nextLine();
			System.out.println("Enter the information about boxes and I'll sort them.\n");
		
			for(int i =0; i<boxes.length; i++)//collects all of the values to create an instance of box
			{
				System.out.println("Enter the label, length, width, and height (all feet) of box " + i);
				label = input.nextLine();
				length = input.nextDouble();
				width = input.nextDouble();
				height = input.nextDouble();
				boxes[i] = new Box(label, length, width, height);
				input.nextLine();
			}
			
			boolean swapped = true;
			while(swapped)//sorts the boxes based on volume using a bubble sort
			{
				swapped = false;
				for(int i = 0; i<boxes.length-1; i++)
				{
					if(boxes[i].getVolume() >= boxes[i+1].getVolume())
					{
						Box temp = boxes[i];
						boxes[i] = boxes[i+1];
						boxes[i+1] = temp;
						swapped = true;
					}
				}
			}
			System.out.println("Sorted boxes");
			for(int i = 0; i<boxes.length; i++)
			{
				System.out.println(boxes[i].toString());
			}
			System.out.println("Would you like to sort more boxes?");//asks the user to play again, continues the program or terminates it
			String dec = input.nextLine();
			if(dec.equalsIgnoreCase("Yes"))
			{
				playAgain = true;
			}
			else
			{
				playAgain = false;
			}
		}while(playAgain);
		
		System.out.println("Goodbye");

	}

}
