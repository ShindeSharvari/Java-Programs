// Print alternate characters in given range by user using while

import java.util.Scanner;

class AlternateAlphabetWhile 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter starting character: ");
		char start = sc.next().charAt(0);

		System.out.print("Enter ending character: ");
		char end = sc.next().charAt(0);

		while(start <= end)
		{
			System.out.println(start);
			start+=2;
		}
	}
}
