/*
 * Brennan Johnson
 */
import java.util.Scanner;
public class Lab07 {

	public static void main(String[] args) 
	{
		int[][] matrixOne;//creates all three matrices that will be used
		int[][] matrixTwo;
		int[][] matrixThree;
		int length = 0;
		int width = 0;
		
		System.out.println("Please enter the length and width of the first matrix");
		matrixOne = populateMatrix();
		
		System.out.println("Please enter the length and width of the second matrix");
		matrixTwo = populateMatrix();
		
		if(matrixOne.length == matrixTwo.length)//checks if there are equal number of rows and columns to ensure matrices are same size
		{
			for(int i = 0; i <matrixOne.length; i++)
			{
				if(matrixOne[i].length != matrixTwo[i].length)
				{
					System.out.println("Matrices do not match. Cannot be added.");
					System.exit(0);
				}
			}
		}
		else
		{
			System.out.println("Matrices do not match. Cannot be added.");
			System.exit(0);
		}
		matrixThree = new int[matrixOne.length][matrixOne[0].length];//sets the size of the third matrix to the same size as matrix one and two
		
		printMatrix(matrixOne);
		System.out.println(" + ");
		printMatrix(matrixTwo);
		
		for(int i=0; i<matrixOne.length; i++)//adds together each index of the matrices.
		{
			for(int j=0; j<matrixOne[i].length; j++)
			{
				matrixThree[i][j] = matrixOne[i][j] + matrixTwo[i][j];
			}
			
		}
		System.out.println("=");
		printMatrix(matrixThree);
	}
	public static void printMatrix(int[][] matrix)//used a method to decrease the amount of for loops used
	{
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[i].length; j++)
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static int[][] populateMatrix()//used a method to simplify the code, less for loops are used
	{
		Scanner input = new Scanner(System.in);
		int[][] matrix;
		int length = 0;
		int width = 0;
		length = input.nextInt();
		input.nextLine();
		width = input.nextInt();
		matrix = new int[length][width];
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[i].length; j++)
			{
				System.out.println("Enter the value for " + i + " " + j);
				matrix[i][j] = input.nextInt();
				input.nextLine();
			}
		}
		return matrix;
	}
	

}
