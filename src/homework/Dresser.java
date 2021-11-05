/*
 * Brennan Johnson
 */
package homework;

public class Dresser 
{
	private Clothing[][] clothes;
	private String[] types = {"Undergarments", "Socks", "Stockings", "Tops", "Bottoms", "Capes"};
	
	public Dresser()
	{
		this.clothes = new Clothing[5][10];
	}
	
	public void add(Clothing c)
	{
		String item = c.getType();
		for(int i = 0; i<this.types.length; i++)
		{
			if(item.equalsIgnoreCase(this.types[i]))
			{
				if(item.equalsIgnoreCase(this.types[1]) || item.equalsIgnoreCase(this.types[2]))
				{
					for(int j = 0; j<this.clothes[1].length; i++)
					{
						if(this.clothes[1][j] == null)
						{
							clothes[1][j] = c;
							break;
						}
					}
					if(clothes[1][clothes.length-1] != null)
					{
						System.out.println("This drawer is full");
					}
				}
				else 
				{
					for(int k = 0; k<this.clothes[i].length; i++)
					{
						if(clothes[i][k] == null)
						{
							clothes[i][k] = c;
							break;
						}
					}
					if(clothes[i][clothes.length-1] != null)
					{
						System.out.println("This drawer is full");
					}
				}
			}
				
				
		}
			
	}
	
	public void remove(Clothing c)
	{
		for(int i = 0; i<this.clothes.length; i++)
		{
			for(int k = 0; k<this.clothes[i].length; k++)
			{
				if(c.equals(this.clothes[i][k]))
				{
					clothes[i][k] = null;
				}
			}
		}
	}
	
	public void print()
	{
		for(int i = 0; i<clothes.length; i++)
		{
			for(int j = 0; j<clothes[i].length; j++)
			{
				if(clothes[i][j] == null)
					break;
				System.out.print(clothes[i][j].toString() + " ");
			}
			System.out.println();
		}
	}
}
	
