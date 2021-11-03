/*
 * Brennan Johnson
 */
public class PBJSandwhich 
{
	private Bread topSlice;
	private PeanutButter peanutButter;
	private Jelly jelly;
	private Bread bottomSlice;
	
	public PBJSandwhich()//sets each instance of the other objects to their default values
	{
		this.setTopSlice(new Bread());
		this.setPeanutButter(new PeanutButter());
		this.setJelly(new Jelly());
		this.setBottomSlice(new Bread());
	}
	
	public PBJSandwhich(Bread tS, PeanutButter p, Jelly j, Bread bS)
	{
		this.setTopSlice(tS);
		this.setPeanutButter(p);
		this.setJelly(j);
		this.setBottomSlice(bS);
	}
	
	public void setTopSlice(Bread t)
	{
		this.topSlice = t;
	}
	
	public void setPeanutButter(PeanutButter p)
	{
		this.peanutButter = p;
	}
	
	public void setJelly(Jelly j)
	{
		this.jelly = j;
	}
	
	public void setBottomSlice(Bread b)
	{
		this.bottomSlice = b;
	}
	
	public Bread getTopSlice()
	{
		return this.topSlice;
	}
	
	public Bread getBottomSlice()
	{
		return this.bottomSlice;
	}
	
	public Jelly getJelly()
	{
		return this.jelly;
	}
	
	public PeanutButter getPeanutButter()
	{
		return this.peanutButter;
	}
	
	public boolean equals(PBJSandwhich pbj)
	{
		return pbj != null && pbj.getBottomSlice().equals(this.bottomSlice) && pbj.getTopSlice().equals(this.topSlice) && pbj.getJelly().equals(this.jelly) && pbj.getPeanutButter().equals(this.peanutButter);
	}
	
	public String toString()//displays the whole sandwhich
	{
		return "[PB & J Sandwhich] Top Slice: " + this.topSlice.toString() + " PeanutButter: " + this.peanutButter.toString() + " Jelly: " + this.jelly.toString() + " Bottom Slice: " + this.bottomSlice.toString();
	}
}
