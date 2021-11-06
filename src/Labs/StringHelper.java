/*
 * Brennan Johnson
 */
package Labs;

public class StringHelper 
{
	public static boolean hasAllUniqueCharacters(String s)
	{
		s = s.toLowerCase();
		boolean repeat = true;
		for(int i = 0; i<s.length(); i++)
		{
			for(int j = i+1; j<s.length(); j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					repeat = false;
				}
			}
		}
		return repeat;
	}
	
	public static String meshStrings(String one, String two)
	{
		String newString = "";
		int length;
		if(one.length() > two.length())
		{
			length = two.length();
			for(int i = 1; i <length+1; i++)
			{
					newString += one.substring(i-1, i) + two.substring(i-1, i);
			}
			newString += one.substring(length);
		}
		else
		{
			length = one.length();
			for(int i = 1; i <length+1; i++)
			{
					newString += one.substring(i-1, i) + two.substring(i-1, i);
			}
			newString += two.substring(length);
		}
			
		return newString;
	}
	
	public static String replaceVowelsWithOodle(String s)
	{
		String[] vowels = {"a", "e", "i", "o", "u"};
		String newString = "";
		for(int j = 0; j<s.length(); j++)
		{
			for(int i = 0; i<vowels.length; i++)
			{
				if(s.substring(j, j+1).equalsIgnoreCase(vowels[i]))
				{
					newString += s.replace(s.substring(j,j+1), "oodle");
				}
			}
		}
		return newString;
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

