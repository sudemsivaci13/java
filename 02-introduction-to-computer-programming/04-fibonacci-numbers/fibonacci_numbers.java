package projects;

import java.util.Scanner;

public class fibonacci_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s = new Scanner(System.in);

System.out.print("Enter the number of Fibonacci terms to display: ");
int num = s.nextInt();

int s1 = 0;
int s2 = 1;

int sum = 0;

for(int i = 1; i<=num; i++)
{
	if (i == num) 
	{
		System.out.print(s1);
	} 
	
	else 
	{
		System.out.print(s1 + ", ");
	}
	
	sum = s1+s2;
	s1 = s2;
	s2 = sum;
}

s.close();

	}

}
