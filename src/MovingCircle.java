/*
 * Brennan JOhnson
 */
public class MovingCircle 
{
	private double x;
	private double y;
	private double diameter;
	private double velocityX;
	private double velocityY;
	
	public MovingCircle()//sets each instance variable to their default values
	{
		this.setX(0.0);
		this.setY(0.0);
		this.setDiameter(0.0);
		this.setVelocityX(0.0);
		this.setVelocityY(0.0);
	}
	
	public MovingCircle(double x, double y, double d, double vX, double vY)
	{
		this.setX(x);
		this.setY(y);
		this.setDiameter(d);
		this.setVelocityX(vX);
		this.setVelocityY(vY);
	}
	
	public void setX(double n)
	{
		this.x = n;
	}
	public void setY(double n)
	{
		this.y = n;
	}
	public void setDiameter(double n)
	{
		if(n>0.0)//checks if diameter is a positive number
		{
			this.diameter = n;
		}
		else
		{
			this.diameter = 0;
		}
	}
	public void setVelocityX(double v)
	{
		this.velocityX = v;
	}
	public void setVelocityY(double v)
	{
		this.velocityY = v;
	}
	
	public double getX()
	{
		return this.x;
	}
	public double getY()
	{
		return this.y;
	}
	public double getDiameter()
	{
		return this.diameter;
	}
	public double getVelocityX()
	{
		return this.velocityX;
	}
	public double getVelocityY()
	{
		return this.velocityY;
	}
	
	public boolean equals(MovingCircle m)
	{
		return this.x == m.getX() && this.y == m.getY() && this.diameter == m.getDiameter() && this.velocityX == m.getVelocityX() && this.velocityY == m.getVelocityY();
	}
	
	public String toString()//displays all instance variables of the cirlce
	{
		return "[Cirlce]X: " + this.x + " Y: " + this.y + " Diameter " + this.diameter + " Velocity X: " + this.velocityX + " Velocity Y: " + this.velocityY;
	}
	
	public void move()//adds the velocity to x and y components to simulate moving
	{
		this.x += this.velocityX;
		this.y += this.velocityY;
	}
	public boolean isColliding(MovingCircle c)//checks if the two circles have collided
	{
		double r1 = this.diameter/2.0;
		double r2 = c.getDiameter()/2.0;
		double sumC = Math.pow((this.x - c.getX()), 2) + Math.pow((this.y - c.getY()), 2);
		return (r1 + r2 >= Math.sqrt(sumC));
		
	
	}
	
}
