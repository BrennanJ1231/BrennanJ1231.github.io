/*
 * Brennan Johnson
 */
public class Bread 
{
	private String name;
	private int calories;
	private String type;
	
	public Bread()//sets to all of its default values
	{
		this.setName("none");
		this.setCalories(50);
		this.setType("Whole Grain");
	}
	
	public Bread(String n, int c, String t)
	{
		this.setName(n);
		this.setCalories(c);
		this.setType(t);
	}
	
	public void setName(String n)
	{
		if( n != null)
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
		if(c <= 250 && c >= 50)
		{
			this.calories = c;
		}
		else
		{
			this.calories = 50;
		}
	}
	
	public void setType(String t)
	{
		if(t != null)
		{
			if(t.equalsIgnoreCase("Honey Wheat") || t.equalsIgnoreCase("White") || t.equalsIgnoreCase("Whole Grain") || t.equalsIgnoreCase("Whole Wheat"))
			{
				this.type = t;
			}
			else
			{
				this.type = "Whole Grain";
			}
		}
		else
		{
			this.type = "Whole Grain";
		}
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getType()
	{
		return this.type;
	}
	public int getCalories()
	{
		return this.calories;
	}
	
	public boolean equals(Bread b)
	{
		return (b != null) && b.getName().equalsIgnoreCase(this.name) && b.getType().equalsIgnoreCase(this.type) && b.getCalories() == this.getCalories();
	}
	
	public String toString()
	{
		return "[Bread] Name: " + this.name + " Type: " + this.type + " Calories: " + this.calories;
	}
	
}
