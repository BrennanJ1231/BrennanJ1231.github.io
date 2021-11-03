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
				}
			}
				
				
		}
			
	}
}
	
