/*
 * Brennan Johnson
 */
public class Jelly 
{
	private String name;
	private int calories;
	private String fruitType;
	
	public Jelly()//sets to all of its default values
	{
		this.setName("none");
		this.setCalories(50);
		this.setFruitType("Grape");
	}
	
	public Jelly(String n, int c, String t)
	{
		this.setName(n);
		this.setCalories(c);
		this.setFruitType(t);
	}
	
	public void setName(String n)
	{
		if(n != null)
		{
			this.name = n;
		}
		else
		{
			this.name = "none";
		}
	}
	
	public void setCalories(int c)
	{
		if(c<=200 && c >= 50)
		{
			this.calories = c;
		}
		else
		{
			this.calories = 50;
		}
	}
	
	public void setFruitType(String t)
	{
		if( t.equalsIgnoreCase("Apple") || t.equalsIgnoreCase("Blackberry") || t.equalsIgnoreCase("Grape") || t.equalsIgnoreCase("Mango") || t.equalsIgnoreCase("Tomato"))
		{
			this.fruitType = t;
		}
		else
		{
			this.fruitType = "Grape";
		}
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getCalories()
	{
		return this.calories;
	}
	
	public String getFruitType()
	{
		return this.fruitType;
	}
	
	public boolean equals(Jelly j)
	{
		return j != null && j.getCalories() == this.calories && j.getName().equalsIgnoreCase(this.name) && j.getFruitType().equalsIgnoreCase(this.fruitType);
	}
	
	public String toString()
	{
		return "[Jelly] Name: " + this.name + " Fruit Type: " + this.fruitType + " Calories: "  + this.calories;
	}
}
