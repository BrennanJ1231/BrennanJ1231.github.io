package Labs;

public class Truck extends Vehicle
{
	private double loadCapacity;
	private double towingCapacity;
	
	public Truck()
	{
		super();
		this.setLoadCapacity(0.0);
		this.setTowingCapacity(0.0);
	}
	
	public Truck(String mName, int c, String oName, double tC, double lC)
	{
		super(mName, c, oName);
		this.setLoadCapacity(lC);
		this.setTowingCapacity(tC);
	}
	
	public void setLoadCapacity(double lC)
	{
		if(lC >= 0.0)
		{
			this.loadCapacity = lC;
		}
		else
		{
			this.loadCapacity = 0.0;
		}
	}
	
	public void setTowingCapacity(double tC)
	{
		if(tC >=0.0)
		{
			this.towingCapacity = tC;
		}
		else
		{
			this.towingCapacity = 0.0;
		}
	}
	
	public double getLoadCapacity()
	{
		return this.loadCapacity;
	}
	
	public double getTowingCapacity()
	{
		return this.towingCapacity;
	}
	
	public String toString()
	{
		return super.toString() + " Load Capacity: " + this.loadCapacity + " Towing Capacity: " + this.towingCapacity;
	}
	
	public boolean equals(Truck t)
	{
		return super.equals(t) && this.towingCapacity == t.getTowingCapacity() && this.loadCapacity == t.getLoadCapacity();
	}
	
}
