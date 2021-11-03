/*
 * Brennan Johnson
 */
public class Frame 
{
	private double size;
	private String type;
	
	public Frame()
	{
		this.setSize(18.5);
		this.setType("Diamond");
	}
	
	public Frame(double s, String t)
	{
		this.setSize(s);
		this.setType(t);
	}
	
	public void setSize(double s)
	{
		if(s >= 18.5 && s <=60)//checks size of tire is within valid ranges
		{
			this.size = s;
		}
		else
		{
			this.size = 18.5;
		}
	}
	
	public void setType(String s)
	{
		String[] types = {"Step-Through", "Penny-Farthing", "Diamond"};//allows us to check if the type is valid
		if( s != null)
		{
			for(int i = 0; i < types.length; i++)
			{
				if(types[i].equalsIgnoreCase(s))
				{
					this.type = s;
					break;
				}
				else
				{
					this.type = "Diamond";
				}
			}
		}
	}
	
	public double getSize()
	{
		return this.size;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public boolean equals(Frame f)
	{
		return this.size == f.getSize() && this.type.equalsIgnoreCase(f.getType());
	}
	
	public String toString()
	{
		return "[Frame] Size: " + this.size + " Type: " + this.type;
	}
}
