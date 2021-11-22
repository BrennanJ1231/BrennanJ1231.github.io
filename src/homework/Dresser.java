/*
 * Brennan Johnson
 */
package homework;

public class Dresser 
{
	private Clothing[][] clothes;
	private String[] types = {"Undergarment", "Socks", "Stocking", "Top", "Bottom", "Cape"};
	
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
				if(item.equalsIgnoreCase(this.types[1]) || item.equalsIgnoreCase(this.types[2]))//checks whether it is socks or stockings since those go into the same drawer
				{
					if(this.clothes[1][this.clothes[1].length-1] != null)
					{
						System.out.println("This drawer is full");
						break;
					}
					for(int j = 0; j<this.clothes[1].length; j++)
					{
						if(this.clothes[1][j] == null)
						{
							clothes[1][j] = c;
							break;
						}
					}
				}
				else 
				{
					if(this.clothes[i][this.clothes[i].length-1] != null)//checks for any of the other items and puts them in their corresponding drawers
					{
						System.out.println("This drawer is full");
						break;
					}
					for(int j = 0; j<this.clothes[i].length; j++)
					{
						if(this.clothes[i][j] == null)
						{
							this.clothes[i][j] = c;
							break;
						}
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
				if(clothes[i][j] == null)//makes sure only values that are not null are displayed
				{
					break;
				}
				
				System.out.print(clothes[i][j].toString() + " ");
			}
			System.out.println();
		}
	}
}
	
