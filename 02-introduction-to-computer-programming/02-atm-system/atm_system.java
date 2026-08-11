package projects;

import java.util.Scanner;

public class atm_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s = new Scanner(System.in);

int balance = 1000, a, am;

System.out.println("Balance: " +balance);

while (true)
{
	System.out.println();
	System.out.println("1-) deposit money");
	System.out.println("2-) withdraw money");
	System.out.println("3-) balance inquiry");
	System.out.println("4-) quit");
	
	System.out.print("Select action: ");
	a = s.nextInt();
	
	
	if (a==1)
	{
		System.out.print("Amount: ");
		am = s.nextInt();
		balance += am;
	}
	
	else if (a==2)
	{
		System.out.print("Amount: ");
	    am = s.nextInt();
	    
	    if (am>balance)
	    	System.out.println("Insufficient funds. ");
	    
	    else
	    	balance -=am;
	}
	
	else if (a==3)
	{
		System.out.println("Recent balance: " +balance);
	}
	
	else if (a==4)
	{
		System.out.println("Quitting.");
		break;
	}
	
	else
		System.out.println("Invalid action.");
	
}

s.close();

	}

}
