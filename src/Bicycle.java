/*
 * Brennan Johnson
 */
public class Bicycle 
{
	private String make;
	private Wheel frontWheel;
	private Wheel backWheel;
	private Frame f;
	
	public Bicycle()
	{
		this.setMake("none");
		this.setFrontWheel(new Wheel());
		this.setBackWheel(new Wheel());
		this.setFrame(new Frame());
	}
	public Bicycle(String s, Wheel fW, Wheel bW, Frame f)
	{
		this.setMake(s);
		this.setFrontWheel(fW);
		this.setBackWheel(bW);
		this.setFrame(f);
	}
	
	public void setMake(String s)
	{
		if(s != null)
		{
			this.make = s;
		}
		else
		{
			this.make = "none";
		}

	}
	
	public void setFrontWheel(Wheel fW)
	{
		this.frontWheel = fW;
	}
	
	public void setBackWheel(Wheel bW)
	{
		this.backWheel = bW;
	}
	
	public void setFrame(Frame f)
	{
		this.f = f;
	}
	
	public Wheel getFrontWheel()
	{
		return this.frontWheel;
	}
	
	public Wheel getBackWheel()
	{
		return this.backWheel;
	}
	public Frame getFrame()
	{
		return this.f;
	}
	public String getMake()
	{
		return this.make;
	}
	
	public boolean equals(Bicycle b)
	{
		return this.make.equalsIgnoreCase(b.getMake()) && this.frontWheel.equals(b.getFrontWheel()) && this.backWheel.equals(b.getBackWheel()) && this.f.equals(b.getFrame());
	}
	
	public String toString()
	{
		return "[Bicycle] Make: " + this.make + " Front Wheel: " + this.frontWheel.toString() + " Back Wheel: " + this.backWheel.toString() + " Frame: " + this.f.toString();
	}
	
	

}
