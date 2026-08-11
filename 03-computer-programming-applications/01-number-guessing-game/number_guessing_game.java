package projects;

import java.util.Scanner;

import java.util.Random;

public class number_guessing_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);

Random random = new Random();

int min = 1, max = 20;

int secretNumber = random.nextInt(max-min+1)+min;

int attempt = 5;

System.out.println("Welcome to the Number Guessing Game!");
System.out.println("You have 5 attempts to guess the number between 1 and 20.");

while (attempt>0)
{
	
System.out.print("Enter your guess: ");
int guess = input.nextInt();

if (guess==secretNumber)
{
	System.out.println("Congratulations! You guessed the correct number.");
	break;
}

else
{
	attempt--;
	
	if (attempt>0)
	{
		System.out.println("Incorrect guess. You have " + attempt + " attempts left.");
		
		if (guess<secretNumber)
		{
			System.out.println("Try a higher number.");
		}
		
		else
		{
			System.out.println("Try a lower number.");
		}
	}
	
	else
	{
		System.out.println("You have run out of attempts. The secret number was: " + secretNumber);	
	}
}

}

input.close();

	}

}
