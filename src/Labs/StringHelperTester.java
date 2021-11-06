package Labs;
/*
 * Brennan Johnson
 */
public class StringHelperTester {

	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to String Helper Tester\n");
		System.out.println("Testing Has All Unique Characters with \"facetiously\"");
		System.out.println(StringHelper.hasAllUniqueCharacters("faceriously"));
		System.out.println("Testing Has All Unique Characters with \"banana\"");
		System.out.println(StringHelper.hasAllUniqueCharacters("banana"));
		System.out.println();
		System.out.println("Testing Mesh Strings with \"harp\" and \"fiddle\"");
		System.out.println(StringHelper.meshStrings("harp", "fiddle"));
		System.out.println("Testing Replace Vowels with Ooodle with \"burrito\"");
		System.out.println(StringHelper.replaceVowelsWithOodle("burrito"));

	}

}
