/*
 * Brennan Johnson
 */
import java.util.Scanner;
public class Lab02 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String enteredDate = "";
		int month = 00;
		int day = 00;
		int year = 0000;
		int index = 0;
		int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};//keeps a list of valid months
		boolean validMonth = false;//assumed to be false so that all checks can be made
		boolean validDay = false;
		boolean validYear = false;
		String copy = "";
		String error = "";
		System.out.println("Enter a date using the format \"<<MONTH>>/<<DAY>>/<<YEAR>>\"");
		enteredDate = keyboard.nextLine();
		
		index = enteredDate.indexOf("/");
		month = Integer.parseInt(enteredDate.substring(0, index));
		copy = enteredDate.substring(index+1);
		
		index = copy.indexOf("/");
		day = Integer.parseInt(copy.substring(0, index));
		copy = copy.substring(index+1);
		
		index = copy.indexOf("/");
		year = Integer.parseInt(copy);
		
		for(int i = 0; i < months.length; i++)//runs through the list of valid months to check if entered month is valid
		{
			if(month == months[i])
				validMonth = true;
			
				
		}
		
		if(validMonth == false)
		{
			error = error + "Invalid month. ";
		}
		
		if(month == 4 || month == 6 || month == 9 || month == 11)//checks for months that only have 30 days
		{
			if(1 <= day && day <= 30)
				validDay = true;
			else
				error = error + "The day is invalid for this month. Must be between 1 and 30 ";
		}
		else
		{
			if(1 <= day && day <= 31)
			{
				validDay = true;
			}
			else
			{
				error = error + "The day is invalid for this month. Must be bewteen 1 and 31 ";
				
			}
		}
		
		
		if(month == 2 && day == 29)//Checks to make sure year is divisible by 4 or 400 and not divisible by 100;
		{
			if(year % 4 == 0)
			{
				if(year%100==0)
				{
					if(year%400 ==0)
					{
						validYear = true;
					}
					else
					{
						error = error + "The date given is not a leap year";
					}
				}
			}
		}
		else
		{
			validYear = true;
		}
		
		
		if(validYear && validDay && validMonth)
		{
			System.out.println(enteredDate + " is a valid date!");
		}
		else
		{
			System.out.println(enteredDate + " is invalid! " + error);
		}
		
		
	}

}
