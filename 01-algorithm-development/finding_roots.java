package projects;

import java.util.Scanner;

public class finding_roots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s = new Scanner(System.in);

System.out.print("a: ");
int a = s.nextInt();

System.out.print("b: ");
int b = s.nextInt();

System.out.print("c: ");
int c = s.nextInt();

double d = Math.pow(b, 2)-(4*a*c);

System.out.println("Your function is " +a+ "x²+" +b+ "x+" +c+ " and discriminant is " +d);

if (d<0)
{
	System.out.println("No real roots.");
}

else if (d==0)
{
	double x1 = -b/(2*a);
	
	System.out.println("There are two equal roots and these roots are: " +x1);
}

else
{
	double x1 = (-b+Math.sqrt(d))/(2*a);
	double x2 = (-b-Math.sqrt(d))/(2*a);
	
	System.out.println("there are two roots and these roots are: " +x1+ ", " +x2);
}

s.close();

	}

}
