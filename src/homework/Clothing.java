/*
 * Brennan Johnson
 */
package homework;

public class Clothing 
{
	private String type;
	private String color;
	private String[] colorValues = {"Brown", "Red", "Pink", "Black", "White", "Orange", "Green", "Blue", "Purple", "Grey"};
	private String[] typeValues = {"Undergarment", "Socks", "Stockings", "Top", "Bottom", "Cape"};
	
	public Clothing()
	{
		this.setType("Socks");
		this.setColor("Black");
	}
	
	public Clothing(String t, String c)
	{
		this.setType(t);
		this.setColor(c);
	}
	
	public void setType(String t)
	{
		for(int i =0; i<this.typeValues.length; i++)
		{
			if(t.equalsIgnoreCase(this.typeValues[i]))
			{
				this.type = t;
				break;
			}
			else
			{
				this.type = "Socks";
			}
		}
	}
	
	public void setColor(String c)
	{
		for(int i = 0; i<this.colorValues.length; i++)
		{
			if(c.equalsIgnoreCase(this.colorValues[i]))
			{
				this.color = c;
				break;
			}
			else
			{
				this.color = "Black";
			}
		}
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public String toString()
	{
		return "[Clothing] Type: " + this.type + " Color: " + this.color;
	}
	
	public boolean equals(Clothing c)
	{
		return c != null && this.color.equalsIgnoreCase(c.getColor()) && this.type.equalsIgnoreCase(c.getType());
	}
}
