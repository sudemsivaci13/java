package projects;

import java.util.Scanner;

public class simple_calculator {
	
	static double add (double x, double y)
	{
		return x+y;
	}
	
	static double sub (double x, double y)
	{
		return x-y;
	}
	
	static double mul (double x, double y)
	{
		return x*y;
	}
	
	static String div (double x, double y)
	{
		if (y==0)
		{
			return "Undefined (division by 0)";
		}
		
		else
		{
			return String.valueOf(x/y);
		}
	}
	
	static double ex (double x, double y)
	{
		return Math.pow(x, y);
	}

	static String sr (double x)
	{
		if (x < 0)
		{
			return "Undefined (square root of negative number)";
		}
		
		else
		{
			return String.valueOf(Math.sqrt(x));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner (System.in);

int choice;

while (true)
{
	System.out.println("=== SIMPLE CALCULATOR ===");
	
	System.out.println();
	
	System.out.println("1- Add");
	System.out.println("2- Sub");
	System.out.println("3- Mul");
	System.out.println("4- Div");
	System.out.println("5- Exponentiation (x^y)");
	System.out.println("6- Square Root (√x)");
	System.out.println("0- Exit");
	
	System.out.println();
	
	System.out.print("Enter your choice: ");
	choice = input.nextInt();
	
	System.out.println();
	
	if (choice == 0)
	{
		System.out.println("Program stopped!");
		break;
	}
	
	switch (choice)
	{
	
	case 1:
	{
		System.out.print("Enter first number: ");
		double a1 = input.nextDouble();
		
		System.out.print("Enter second number: ");
		double a2 = input.nextDouble();
		
		System.out.println();
		
		System.out.println(a1 + " + " + a2 + " = " + add(a1, a2) + "\n");
		
		break;
	}
	
	case 2:
	{
		System.out.print("Enter first number: ");
		double b1 = input.nextDouble();
		
		System.out.print("Enter second number: ");
		double b2 = input.nextDouble();
		
		System.out.println();
		
		System.out.println(b1 + "-" + b2 + "=" + sub(b1,b2));
		
		System.out.println();
		
		break;
	}
	
	case 3:
	{
		System.out.print("Enter first number: ");
		double c1 = input.nextDouble();
		
		System.out.print("Enter second number: ");
		double c2 = input.nextDouble();
		
		System.out.println();
		
		System.out.println(c1 + "*" + c2 + "=" + mul(c1,c2));
		
		System.out.println();
		
		break;
	}
	
	case 4:
	{
		System.out.print("Enter first number: ");
		double d1 = input.nextDouble();
		
		System.out.print("Enter second number: ");
		double d2 = input.nextDouble();
		
		System.out.println();
		
		System.out.println(d1 + "/" + d2 + "=" + div(d1,d2));
		
		System.out.println();
		
		break;
	}
	
	case 5:
	{
		System.out.print("Enter base number: ");
		double e1 = input.nextDouble();
		
		System.out.print("Enter power number: ");
		double e2 = input.nextDouble();
		
		System.out.println();
		
		System.out.println(e1 + "^" + e2 + "=" + ex(e1,e2));
		
		System.out.println();
		
		break;
	}
	
	case 6:
	{
		System.out.print("Enter number: ");
		double f1 = input.nextDouble();
		
		System.out.println();
		
		System.out.println(f1 + "^1/2"  + "=" + sr(f1));
		
		System.out.println();
		
		break;
	}
	
	default:
	{
		System.out.println("Invalid choice.");
		break;
	}
	}
}

input.close();

	}

}
