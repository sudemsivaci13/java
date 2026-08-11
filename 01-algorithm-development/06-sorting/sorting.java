package projects;

import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s = new Scanner (System.in);

int [] nums = new int [5];

int temp;

for (int i = 0; i<nums.length; i++)
{
	System.out.print((i+1) + ". number: ");
	nums[i] = s.nextInt();
}

for (int j = 0; j<nums.length-1; j++)
{
	for (int k = 0; k<nums.length-1; k++)
	{
		if (nums[k]>nums[k+1])
		{
			temp = nums[k];
			nums[k] = nums[k+1];
			nums[k+1] = temp;
		}
	}
}

System.out.println("\nSorted Array:");

for (int l = 0; l<nums.length; l++)
{
	System.out.println(nums[l]);
}

s.close();

	}

}
