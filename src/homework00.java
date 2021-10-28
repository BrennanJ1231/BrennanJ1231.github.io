/*
 * Brennan Johnson
 */
import java.util.Scanner;
public class homework00 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String firstNumber = "";
		String secondNumber = "";
		int num1 = 0;
		int num2= 0;
		int total = 0;
		
		System.out.println("Enter first number in binary to be added");
		firstNumber = keyboard.nextLine();
		System.out.println("Enter second number in binary to be added");
		secondNumber = keyboard.nextLine();
		
		num1 = convertToDecimal(firstNumber);//using the method simplifies the program and means less code to write. 
		num2 = convertToDecimal(secondNumber);
		total = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + total);
		
	}
	public static int convertToDecimal(String n)//takes the string entered to be converted to decimal number
	{
		int decimalNumber = 0;
		int binaryFactor = 8;//starts at eight because we are only taking 4 bit binary integers11
		for(int i = 0; i<n.length(); i++)// iterates through the string and converting each binary digit to a decimal then adding it back 
		{
			decimalNumber += Integer.parseInt(n.substring(i, i+1)) * binaryFactor;
			binaryFactor = binaryFactor/2;//changes the binary factor so that each iteration will have the proper factor according to its place
		}
		return decimalNumber;
	}
}
