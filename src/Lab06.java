/*
 * Brennan Johnson
 */
import java.util.Scanner;
public class Lab06 {

	public static void main(String[] args) 
	{
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};// use two list so that we can sort the vowels 
		int[] vowelCount = new int[5];
		String enteredWord;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome tp the vowel counter and sorter!");
		System.out.println("Enter a phrase");
		enteredWord = keyboard.nextLine();
		enteredWord = enteredWord.toLowerCase();
		for(int i = 0; i < enteredWord.length(); i++)//gets the counts of each vowel
		{
			char possibleVowel = enteredWord.charAt(i);
			for(int j = 0; j<vowels.length; j++)
			{
				if(vowels[j] == possibleVowel)
				{
					vowelCount[j] += 1;
				}
			}
		}
		
		sortAscending(vowels, vowelCount);//use a method to increase organization and readability

	}
	
	public static void sortAscending(char[] list, int[] countList)//sorts the vowles in ascending order using bubble sort
	{
		boolean swapped = true;
		while(swapped)
		{
			swapped = false;
			for(int i = 0; i<countList.length-1; i++)
			{
				if(countList[i] > countList[i+1])
				{
					int tempCount = countList[i];
					char tempVowel = list[i];
					countList[i] = countList[i+1];
					countList[i+1] = tempCount;
					list[i] = list[i+1];
					list[i+1] = tempVowel;
					swapped = true;
				}
			}
		}
		checkForTies(list, countList);//use method to increase organization and readability
	}
	
	public static void checkForTies(char[] v, int[] vCount)//Checks for ties and if there are ties then swaps them for aplhabetical order
	{
		int tempCount;
		char tempVowel;
		for(int i = 0; i < v.length-1; i++)
		{
			if(vCount[i] == vCount[i+1])
			{
				if(v[i] == 'e' && v[i+1] =='a')
				{
					tempCount = vCount[i];
					tempVowel = v[i];
					vCount[i] = vCount[i+1];
					vCount[i+1] = tempCount;
					v[i] = v[i+1];
					v[i+1] = tempVowel;
				}
				else if(v[i] == 'i' && v[i+1] == 'e')
				{
					tempCount = vCount[i];
					tempVowel = v[i];
					vCount[i] = vCount[i+1];
					vCount[i+1] = tempCount;
					v[i] = v[i+1];
					v[i+1] = tempVowel;
				}
				else if(v[i] =='o' && v[i+1] == 'i')
				{
					tempCount = vCount[i];
					tempVowel = v[i];
					vCount[i] = vCount[i+1];
					vCount[i+1] = tempCount;
					v[i] = v[i+1];
					v[i+1] = tempVowel;
				}
				else if(v[i] == 'u' && v[i+1] =='o')
				{
					tempCount = vCount[i];
					tempVowel = v[i];
					vCount[i] = vCount[i+1];
					vCount[i+1] = tempCount;
					v[i] = v[i+1];
					v[i+1] = tempVowel;
				}
			}
		}
		System.out.println("The vowels and their count");
		for(int i = 0; i < v.length; i++)
		{
			System.out.println(v[i] + " " + vCount[i]);
		}
	}

}
