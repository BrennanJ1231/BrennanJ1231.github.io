/*
 * Brennan Johnson
 */
public class PeanutButter 
{
	private String name;
	private int calories;
	private boolean isCrunchy;
	
	public PeanutButter()//sets to all of its default values
	{
		this.setName("none");
		this.setCalories(100);
		this.setIsCrunchy(false);
	}
	
	public PeanutButter(String n, int c, boolean i)
	{
		this.setName(n);
		this.setCalories(c);
		this.setIsCrunchy(i);
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
		if(c<=300 && c >=100)
		{
			this.calories = c;
		}
		else
		{
			this.calories = 100;
		}
	}
	
	public void setIsCrunchy(boolean i)
	{
		this.isCrunchy = i;
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getCalories()
	{
		return this.calories;
	}
	public boolean getIsCrunchy()
	{
		return this.isCrunchy;
	}
	
	public boolean equals(PeanutButter p)
	{
		return p != null && p.getName().equalsIgnoreCase(this.name) && p.getCalories() == this.calories && p.getIsCrunchy() == this.isCrunchy;
	}
	
	public String toString()
	{
		return "[Peanut Butter] Name: " + this.name + " Crunchy: " + this.isCrunchy + " Calories: " + this.calories;
	}
}
