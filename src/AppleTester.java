/*
 * Brennan Johnson
 */
public class AppleTester {

	public static void main(String[] args) 
	{
		Apple aOne = new Apple();//constructs three instances of apple
		Apple aTwo = new Apple();
		Apple aThree = new Apple();
		
		System.out.println("Welcome to the apple tester");//demonstrates the default constructor
		System.out.println("Creating a default apple");
		System.out.println("Printing default apple's value");
		System.out.println(aOne.toString() + "\n");
		
		System.out.println("Creating another apple");//demonstrates when values are given
		System.out.println("Setting the new apple's values to the following, valid values\n" +
				"Granny smith 0.75 0.99");
		aTwo.setType("Granny Smith");
		aTwo.setWeight(0.75);
		aTwo.setPrice(0.99);
		System.out.println(aTwo.toString() + "\n");//demonstrates the toString() method.
		
		//demonstrates invalid values
		System.out.println("Creating another default apple\n" + " The setting the apple's values to the following, invalid values \"ipad 2.5 -200\"\n"
		+ "Printing the newest apples values which should not have changed from the default values");
		aThree.setPrice(-200);
		aThree.setWeight(2.5);
		aThree.setType("iPad");
		System.out.println(aThree.toString() + "\n");
		
		System.out.println("Checking if the first and last apple have the same values");//demonstrates the eqauls method
		System.out.println(aOne.equals(aThree));
	}

}
