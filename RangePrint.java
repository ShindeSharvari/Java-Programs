// Using while loop print numbers between range provided by users

import java.util.Scanner;

class RangePrint 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting number : ");
        int start = sc.nextInt();
		System.out.print("Enter the ending number : ");
        int end = sc.nextInt();

		if (start < end )
		{
			System.out.println("Ascending Order");
			while (start <= end)
			{
				System.out.println(start);
				start++;
			}
		}
		else
		{
			System.out.println("Descending Order");
			while (start >= end)
			{
				System.out.println(start);
				start--;
			}
		}
	}
}
=