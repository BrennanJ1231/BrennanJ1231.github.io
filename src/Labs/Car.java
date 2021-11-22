package Labs;

public class Car extends Vehicle
{
	private double gasMilage;
	private int numberOfPassengers;
	
	public Car()
	{
		super();
		this.setGasMilage(0.0);
		this.setNumberOfPassengers(0);
	}
	
	public Car( String mName, int c, String oName, double gM, int nP)
	{
		super( mName,  c, oName);
		this.setGasMilage(gM);
		this.setNumberOfPassengers(nP);
	}
	
	public void setGasMilage(double gM)
	{
		if(gM >= 0.0)
		{
			this.gasMilage = gM;
		}
		else
		{
			this.gasMilage = 0.0;
		}
	}
	
	public void setNumberOfPassengers(int nP)
	{
		if(nP >= 0)
		{
			this.numberOfPassengers = nP;
		}
		else
		{
			this.numberOfPassengers = 0;
		}
	}
	
	public double getGasMilage()
	{
		return this.gasMilage;
	}
	
	public int getNumberOfPassengers()
	{
		return this.numberOfPassengers;
	}
	
	public String toString()
	{
		return super.toString() + " Gas Milage: " + this.gasMilage + " Passengers: " + this.numberOfPassengers;
	}
	
	public boolean equals(Car c)
	{
		return super.equals(c) && this.gasMilage == c.getGasMilage() && this.numberOfPassengers == c.getNumberOfPassengers();
	}
}
