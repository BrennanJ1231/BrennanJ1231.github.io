package Labs;
/*
 * Brennan Johnson
 */
public class StringHelperTester {

	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to String Helper Tester\n");//Tests all of the methods in string helper
		System.out.println("Testing Has All Unique Characters with \"facetiously\"");
		System.out.println(StringHelper.hasAllUniqueCharacters("faceriously"));
		System.out.println("Testing Has All Unique Characters with \"banana\"");
		System.out.println(StringHelper.hasAllUniqueCharacters("banana"));
		System.out.println();
		
		System.out.println("Testing Mesh Strings with \"harp\" and \"fiddle\"");
		System.out.println(StringHelper.meshStrings("harp", "fiddle"));
		System.out.println("Testing Mesh Strings with \"pc\" and \"laptop\"");
		System.out.println(StringHelper.meshStrings("pc", "laptop") + "\n");
		
		
		System.out.println("Testing Replace Vowels with Ooodle with \"burrito\"");
		System.out.println(StringHelper.replaceVowelsWithOodle("burrito"));
		System.out.println("Testing Replace Vowels with Ooodle with \"brennan\"");
		System.out.println(StringHelper.replaceVowelsWithOodle("brennan") + "\n");
		
		System.out.println("Testing weight with \"Heavy\"");
		System.out.println(StringHelper.weight("Heavy"));
		System.out.println("Testing weight with \"light\"");
		System.out.println(StringHelper.weight("Light"));

	}

}
