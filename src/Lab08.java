/*
 * Brennan Johnson
 */
import java.util.Random;
public class Lab08 {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int[][] matrix = new int[10][10];
		
		for(int i = 0; i<matrix.length; i++)//randomly populates each index of the matrix
		{
			for(int j = 0; j<matrix[i].length; j++)
			{
				matrix[i][j] = rand.nextInt(10);
			}
		}
		for(int i = 0; i <matrix.length; i++)//displays the first matrix
		{
			for(int j = 0; j<matrix[i].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Matrix flipped horizontally");
		for(int i = 0; i <matrix.length; i++)
		{
			for(int j = 0; j<(matrix[i].length/2); j++)//flips the matrix by swaping each index up to 4 and 5
			{
				int index = (matrix[i].length-1)-j;//method is similar to bubble sort for swapping
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][index];
				matrix[i][index] = temp;
			}
		}
		for(int i = 0; i <matrix.length; i++)//displays the now flipped matrix
		{
			for(int j = 0; j<matrix[i].length; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}
}
