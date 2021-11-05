/*
 * Brennan Johnson
 */
package Labs;

public class StringHelper 
{
	public static boolean hasAllUniqueCharacters(String s)
	{
		
	}
	
	public static String meshStrings(String one, String two)
	{
		String newString = "";
		int length;
		if(one.length() > two.length())
		{
			length = one.length();
		}
		else
		{
			length = two.length();
		}
			
		for(int i = 0; i <length; i++)
		{
			if(one.substring(i-1, i) == null && two.substring(i-1, i) != null)
			{
				newString += two.substring(i-1, i);
			}
			else if(one.substring(i-1, i) != null && two.substring(i-1, i) == null)
			{
				newString += one.substring(i-1, i);
			}
			else
			{
				newString += one.substring(i-1, i) + two.substring(i-1, i);
			}
		}
		return newString;
	}
	
	public static String replaceVowelsWithOodle(String s)
	{
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		for(int i = 0; i <s.length(); i++)
		{
			for(int j = 0; j<vowels.length; i++)
			{
				if(s.charAt(i) == vowels[j])
				{
					s.replace(s.substring(i-1, 1), "oodle");
				}
			}
		}
		return s;
	}
	
	public static double weight(String s)
	{
		double w = 0;
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		for(int i = 0; i <s.length(); i++)
		{
			for(int j = 0; j<vowels.length; j++)
			{
				if(s.charAt(i) == vowels[j])
				{
					w += 2.5;
				}
				else
				{
					w += 3.4;
				}
			}
			
		}
		return w;
	}
}

