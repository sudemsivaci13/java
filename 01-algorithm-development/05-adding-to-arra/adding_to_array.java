package projects;

import java.util.Scanner;

public class adding_to_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s = new Scanner(System.in);

int [] nums = new int [100];

System.out.print("Number count: ");
int nc = s.nextInt();

System.out.println();

for (int i = 0; i < nc; i++)
{
	System.out.print((i+1) + ". number: ");
	int num = s.nextInt();
	
	nums [i] = num;
}

System.out.println();

System.out.println("First Array ");

for (int i = 0; i<=nc-1; i++)
{
	System.out.println("nums [" +i+ "]: " +nums[i]);
}

System.out.println();

System.out.print("Where to add number: ");
int w = s.nextInt();

System.out.print("Number to add: ");
int num = s.nextInt();

for (int i = nc-1; i >= w - 1; i--)
{
	nums [i+1]=nums[i];
}

nums [w-1]= num;

System.out.println();

System.out.println("New Array");

for (int i = 0; i<=nc; i++)
{
	System.out.println("nums [" +i+ "]: " +nums[i]);
}

s.close();

	}

}
