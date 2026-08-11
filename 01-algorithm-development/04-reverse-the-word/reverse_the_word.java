package projects;

import java.util.Scanner;

public class reverse_the_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s = new Scanner(System.in);

System.out.print("String: ");
String str = s.nextLine();

int length = str.length();

for (int i = (length-1); i >= 0; i--)
{
	System.out.print(str.charAt(i));
}

s.close();

	}

}
