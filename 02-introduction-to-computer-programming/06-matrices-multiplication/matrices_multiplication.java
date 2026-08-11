package projects;

import java.util.Scanner;

public class matrices_multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s = new Scanner(System.in);

System.out.print("Enter the number of rows for the first matrix: ");
int r1 = s.nextInt();

System.out.print("Enter the number of columns for the first matrix: ");
int c1 = s.nextInt();

int [][] matrix1 = new int [r1][c1];

System.out.println();

System.out.println("Matrix 1:");

for (int i = 0; i<matrix1.length; i++)
{
	for (int j= 0; j<matrix1[0].length; j++)
	{
		System.out.print("(" + (i+1) + "," + (j+1) + "): ");
		matrix1[i][j] = s.nextInt();
	}
}

System.out.println();

System.out.print("Enter the number of rows for the second matrix: ");
int r2 = s.nextInt();

System.out.print("Enter the number of columns for the second matrix: ");
int c2 = s.nextInt();

int [][] matrix2 = new int [r2][c2];

System.out.println();

System.out.println("Matrix 2:");

for (int i = 0; i<matrix2.length; i++)
{
	for (int j= 0; j<matrix2[0].length; j++)
	{
		System.out.print("(" + (i+1) + "," + (j+1) + "): ");
		matrix2[i][j] = s.nextInt();
	}
}

System.out.println();

if (c1!=r2)
{
	System.out.println("Cannot perform matrix multiplication! (Columns of Matrix 1 must match Rows of Matrix 2)");
}

else
{
	
int [][] matrix3 = new int [r1][c2];

for (int i = 0; i<r1; i++)
{
	for (int j = 0; j<c2; j++)
	{
		for (int k = 0; k<c1; k++)
		{
			matrix3 [i][j] += matrix1[i][k] * matrix2[k][j];
		}
	}
}

System.out.println();

System.out.println("Matrix 1: ");

for (int i = 0; i<matrix1.length; i++)
{
	for (int j = 0; j<matrix1[0].length; j++)
	{
		System.out.print(matrix1[i][j] + "\t");
	}
	
	System.out.println();
	
}

System.out.println();

System.out.println("Matrix 2: ");

for (int i = 0; i<matrix2.length; i++)
{
	for (int j = 0; j<matrix2[0].length; j++)
	{
		System.out.print(matrix2[i][j] + "\t");
	}
	
	System.out.println();
	
}

System.out.println();

System.out.println("Matrix 1 x Matrix 2: ");

for (int i = 0; i<matrix3.length; i++)
{
	for (int j = 0; j<matrix3[0].length; j++)
	{
		System.out.print(matrix3[i][j] + "\t");
	}
	
	System.out.println();
	
}

}

s.close();

	}

}
