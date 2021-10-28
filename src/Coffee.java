/*
 * Brennan Johnson
 */
public class Coffee 
{
	private String name;//Creates each instance varibal
	private int caffeineContent;
	
	public Coffee()//default constructor if no parameters are given
	{
		this.setName("none");
		this.setCaffeineContent(50);
	}
	
	public Coffee(String n, int c)//constructor if parameters are given
	{
		this.setName(n);
		this.setCaffeineContent(c);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getCaffeineContent()
	{
		return this.caffeineContent;
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
	
	public void setCaffeineContent(int c)
	{
		if(c >= 50 && c<=300)
		{
			this.caffeineContent = c;
		}
		else
		{
			this.caffeineContent = 50;
		}
	}
	
	public String toString()
	{
		return "Coffee Name: " + this.name + " Caffeine Amount: " + this.caffeineContent;
	}
	
	public boolean equals(Coffee c)//compares each instance variable of each object to tell if they are equal or not
	{
		return c != null && this.name.equals(c.getName()) && this.caffeineContent == c.getCaffeineContent();
	}
	
	public String riskyAmount()//calculates and returns how many cups of coffee are dangerous
	{
		return "This many cups is dangerous if consumed within an hour:  " + 180.0/((this.caffeineContent/100.0)*6.0);
	}
}
