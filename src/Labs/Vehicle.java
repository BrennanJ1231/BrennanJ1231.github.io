package Labs;

public class Vehicle 
{
	private String manufacturersName;
	private String ownersName;
	private int numberOfCylinders;
	
	public Vehicle()
	{
		this.setManufacturersName("none");
		this.setOwnersName("none");
		this.setNumberOfCylinders(1);
	}
	
	public Vehicle(String mName, int c, String oName)
	{
		this.setManufacturersName(mName);
		this.setOwnersName(oName);
		this.setNumberOfCylinders(c);
	}
	
	public void setManufacturersName(String mName)
	{
		if(mName != null)
		{
			this.manufacturersName = mName;
		}
		else
		{
			this.manufacturersName = "none";
		}
	}
	
	public void setOwnersName(String oName)
	{
		if(oName != null)
		{
			this.ownersName = oName;
		}
		else
		{
			this.ownersName = "none";
		}
	}
	
	public void setNumberOfCylinders(int c)
	{
		if(c > 0)
		{
			this.numberOfCylinders = c;
		}
		else
		{
			this.numberOfCylinders = 1;
		}
	}
	
	public String getManufacturersName()
	{
		return this.manufacturersName;
	}
	
	public String getOwnersName()
	{
		return this.ownersName;
	}
	
	public int getNumberOfCylinders()
	{
		return this.numberOfCylinders;
	}
	
	public String toString()
	{
		return "Manufacturers Name: " + this.manufacturersName + " Number of Cylinders: " + this.numberOfCylinders + " Owner: " + this.ownersName;
				
	}
	
	public boolean equals(Vehicle v)
	{
		return this.manufacturersName.equalsIgnoreCase(v.getManufacturersName()) && this.ownersName.equalsIgnoreCase(v.getOwnersName()) && this.numberOfCylinders == v.getNumberOfCylinders();
	}
}
