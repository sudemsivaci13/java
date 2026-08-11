package projects;

import java.util.Scanner;

public class bmi_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s = new Scanner(System.in);

System.out.print("Your weight (kg): ");
double w = s.nextDouble();

System.out.print("Your height (m, e.g. 1.65): ");
double h = s.nextDouble();

double bmi = w/Math.pow(h, 2);
System.out.println("Your BMI is " + bmi);

if (bmi<18.5) {
	System.out.println("You are Underweight.");
}
else if (bmi < 25.0) {
    System.out.println("You are Healthy.");
} 
else if (bmi < 30.0) {
    System.out.println("You are Overweight.");
} 
else if (bmi < 35.0) {
    System.out.println("You are grade 1 obesity.");
} 
else if (bmi < 40.0) {
    System.out.println("You are grade 2 obesity.");
} 
else {
    System.out.println("You are grade 3 obesity.");
}

s.close();

	}

}
