package projects;

import java.util.Scanner;

public class standart_deviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner = new Scanner (System.in);

double [] data = new double [10];

double sum = 0;
double variance = 0;
double mean, sD;

System.out.println("Enter 10 elements: ");

for (int i = 0; i<data.length; ++i)
{
	System.out.print((i+1) + ". element: ");
	data [i] = scanner.nextDouble();
	sum += data[i];
}

mean = sum/data.length;

for (int i = 0; i<data.length; ++i)
{
	variance += Math.pow(data[i]-mean, 2);
}

variance /= data.length;

sD = Math.sqrt(variance);

System.out.printf("Standard Deviation = %.2f\n", sD);

scanner.close();

	}

}
