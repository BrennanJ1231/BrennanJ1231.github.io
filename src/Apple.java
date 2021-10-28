/*
 * Brennan Johnson
 */
public class Apple 
{
	private String type;
	private double weight;
	private double price;
	
	public Apple()//default constructor
	{
		this.type = "Gala";
		this.weight = 0.0;
		this.price = 0.0;
	}
	
	public Apple(String t, double w, double p)//parameterized constructor
	{
		this.setType(t);
		this.setWeight(w);
		this.setPrice(p);
	}
	
	public void setType(String t)
	{
		if( t !=null)
		{
			if(t.equalsIgnoreCase("Red Delicious") || t.equalsIgnoreCase("Golden Delicious") || t.equalsIgnoreCase("Gala") || t.equalsIgnoreCase("Granny Smith"))
			{
				this.type = t;
			}
		}
		else
		{
			this.type = "gala";//sets to default if it is not an authorized value
		}
	}
	
	
	public void setWeight(double w)
	{
		if(w >=0.0 && w <=2.0)
		{
			this.weight = w;
		}
		else 
		{
			this.weight = 0.0;//sets to default if it is not an authorized value
		}
	}
	
	public void setPrice(double p)
	{
		if(p >=0.0)
		{
			this.price = p;
		}
		else
		{
			this.price = 0.0;//sets to default if it is not an authorized value
		}
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public String toString()
	{
		return "Type: " + this.type + " Weight: " + this.weight + " Price: " + this.price;
	}
	
	public boolean equals(Apple a)
	{
		return this.type.equals(a.getType()) && this.weight == a.getWeight() && this.price == a.getPrice();
	}
}
