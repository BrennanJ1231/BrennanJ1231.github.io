/*
 * Brennan Johnson
 */
public class Wheel 
{
	private double diameter;
	private double width;
	
	public Wheel()
	{
		this.setDiameter(16.0);
		this.setWidth(1.0);
	}
	public Wheel(double d, double w)
	{
		this.setDiameter(d);
		this.setWidth(w);
	}
	
	public void setDiameter(double d)
	{
		if(d >= 16.0 && d<=55.0)
		{
			this.diameter = d;
		}
		else
		{
			this.diameter = 16;
		}
	}
	
	public void setWidth(double w)
	{
		if(w >= 1.0 && w <= 2.5)
		{
			this.width = w;
		}
		else 
		{
			this.width = 1.0;
		}
	}
	
	public double getDiameter()
	{
		return this.diameter;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public boolean equals(Wheel w)
	{
		return this.width == w.getWidth() && this.diameter == w.getDiameter();
	}
	
	public String toString()
	{
		return "[Wheel] Diameter: " + this.diameter + " Width: " + this.width;
	}
}
