package projects;

import java.util.Scanner;

public class armstrong_numbers {
	
	static boolean isArmstrong(int number) {
		
        int originalNumber = number;
        int temp = number;
        int digits = 0;
        int sum = 0;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
       
        return sum == originalNumber;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Armstrong numbers: a number that is equal to the sum of its own digits each raised to the power of the number of digits (153, 370, 371)

		Scanner input = new Scanner(System.in);

        System.out.println("=== ARMSTRONG NUMBER FINDER ===");
        System.out.print("Enter upper limit to find Armstrong numbers (e.g., 10000): ");
        int limit = input.nextInt();

        System.out.println("\nArmstrong numbers up to " + limit + ":");

        for (int i = 1; i <= limit; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " is an Armstrong number.");
            }
        }

        input.close();
    }
}
