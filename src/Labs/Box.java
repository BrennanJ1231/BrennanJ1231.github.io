/*
 * Brennan Johnson
 */
package Labs;

public class Box 
{
	private String label;
	private double length;
	private double width;
	private double height;

	public Box()
	{
		this.setLabel("none");
		this.setLength(1);
		this.setWidth(1);
		this.setHeight(1);
	}
	
	public Box(String l, double len, double w, double h)
	{
		this.setLabel(l);
		this.setLength(len);
		this.setWidth(w);
		this.setHeight(h);
	}
	
	public void setLabel(String l)
	{
		if(l != null)
		{
			this.label = l;
		}
		else
		{
			this.label = "none";
		}
	}
	
	public void setLength(double l)
	{
		if(l >= 0.0)
		{
			this.length = l;
		}
		else
		{
			this.length = 1;
		}
	}
	
	public void setWidth(double w)
	{
		if(w >= 0.0)
		{
			this.width = w;
		}
		else
		{
			this.width = 1;
		}
	}
	
	public void setHeight(double h)
	{
		if(h >=0.0)
		{
			this.height = h;
		}
		else
		{
			this.height = 1;
		}
	}
	
	public String getLabel()
	{
		return this.label;
	}
	
	public double getLength()
	{
		return this.length;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public double getVolume()
	{
		return this.height * this.width * this.length;
	}
	
	public String toString()
	{
		return "Label: " + this.label + "Volume: " + this.getVolume();
	}
}
