/*
 * Brennan Johnson
 */
import java.util.Scanner;
public class DateAndTimeTester 
{
	private String date;
	private String time;
	private int month;
	private int day;
	private int hour;
	private int minutes;
	private int n;
	private String i;
	public void run()
	{
		boolean playAgain = false;
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");
			this.i = input.nextLine();
			this.n = i.indexOf(" ");
			this.date = i.substring(0, n);//splits the input into its respective values
			this.time = i.substring(n+1);
			if(this.isValid())
			{
				System.out.println("The date and time is valid");
			}
			else
			{
				System.out.println("The date and time is not valid");
			}
			System.out.println("Would you like to exit? Type \'quit\' to exit or press [ENTER] to continue");
			this.i = input.nextLine();
			if(i.equals(""))
			{
				playAgain = true;
			}
			else
			{
				playAgain = false;
				System.out.println("Good bye");
			}
		}while(playAgain);//used so that it runs at least once
			
	}
	public boolean isValid()
	{
		return this.isValidDate() && this.isValidTime();
	}
	
	public boolean isValidDate()
	{
		boolean isTrue = false;
		if(this.getMonth() <= 12 && this.getMonth() >= 1)//checks if each day is correct according to what month it is
		{
			if(this.getMonth() == 2 && this.getDay() >=1 && this.getDay() <= 28)//used if date is february
			{
				isTrue = true;
			}
			if(this.getMonth() == 1 || this.getMonth() == 3 || this.getMonth() == 7 || this.getMonth() == 8 || this.getMonth() == 10 || this.getMonth() == 12)
			{
				if(this.getDay() >=1 && this.getDay() <= 31)
				{
					isTrue = true;
				}
			}
			if(this.getMonth() == 4 || this.getMonth() == 9 || this.getMonth() == 11 || this.getMonth() == 6)
			{
				if(this.getDay() >=1 && this.getDay()<=30)
				{
					isTrue = true;
				}
			}
		}
		return isTrue;
	}
	
	public boolean isValidTime()
	{
		if((this.getHour() <= 12 && this.getHour() >=1) && (this.getMinute() < 60 && this.getMinute() >=0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Splits the date and time into its respective components using string methods 
	public int getMonth()
	{
		this.n = this.date.indexOf("/");
		this.month = Integer.parseInt(this.date.substring(0,n));
		return this.month;
	}
	
	public int getDay()
	{
		this.n = this.date.indexOf("/");
		this.day = Integer.parseInt(this.date.substring(n+1));
		return this.day;
	}
	
	public int getHour()
	{
		this.n = this.time.indexOf(":");
		this.hour = Integer.parseInt(this.time.substring(0,n));
		return this.hour;
	}
	
	public int getMinute()
	{
		this.n = this.time.indexOf(":");
		this.minutes = Integer.parseInt(this.time.substring(n+1));
		return this.minutes;
	}
}

